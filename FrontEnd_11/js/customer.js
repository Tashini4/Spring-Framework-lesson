function clearForm() {
        $("#id").val("");
        $("#name").val("");
        $("#address").val("");
    }

    // Save Customer
    $("#save").click(() => {
        let customer = {
            id: $("#id").val(),
            name: $("#name").val(),
            address: $("#address").val()
    };

        $.ajax({
            url: "http://localhost:8080/BackEnd_10_war_exploded/api/v1/customer/save",
            type: "POST",
            contentType: "application/json",
            data: JSON.stringify(customer),
            success: function (response) {
                alert("Customer saved successfully!");
                getAllCustomers();
                clearForm();
    },
         error: function (err) {
                alert("Error saving customer: " + err.responseText);
                console.error(err);
        }
    });
});

    // Update Customer
    $("#update").click(() => {
        let customer = {
            id: $("#id").val(),
            name: $("#name").val(),
            address: $("#address").val()
};

    $.ajax({
        url: "http://localhost:8080/BackEnd_10_war_exploded/api/v1/customer/update",
        type: "PUT",
        contentType: "application/json",
        data: JSON.stringify(customer),
        success: function (response) {
        alert("Customer updated successfully!");
        getAllCustomers();
        clearForm();
    },
        error: function (err) {
            alert("Error updating customer: " + err.responseText);
            console.error(err);
        }
    });
});

    // Delete Customer
    $("#delete").click(() => {
        let customerId = $("#id").val();

     if (!customerId) {
        alert("Please enter an ID to delete.");
        return;
}

    $.ajax({
        url: "http://localhost:8080/BackEnd_10_war_exploded/api/v1/customer/delete/{id}",
        type: "DELETE",
        success: function (response) {
        alert("Customer deleted successfully!");
        getAllCustomers();
        clearForm();
},
    error: function (err) {
        alert("Error deleting customer: " + xhr.responseText);
        console.error(err);
        }
    });
});

    // Get All Customers
    function getAllCustomers() {
    $.ajax({
        url: "http://localhost:8080/BackEnd_10_war_exploded/api/v1/customer/getAll",
        type: "GET",
        success: function (response) {
            let tableBody = $("#customerTableBody");
            tableBody.empty();
            response.forEach(customer => {
                tableBody.append(`
                            <tr>
                                <td>${customer.id}</td>
                                <td>${customer.name}</td>
                                <td>${customer.address}</td>
                            </tr>
                        `);
            });
        },
        error: function (err) {
            alert("Error fetching customers: " + err.responseText);
            console.error(err);
        }
    });
}
