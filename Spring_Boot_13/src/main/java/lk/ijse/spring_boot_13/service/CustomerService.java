package lk.ijse.spring_boot_13.service;

import jakarta.transaction.Transactional;
import lk.ijse.spring_boot_13.dto.CustomerDTO;
import lk.ijse.spring_boot_13.entity.Customer;
import lk.ijse.spring_boot_13.repo.CustomerRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class CustomerService {
    @Autowired
    private CustomerRepo customerRepo;
    public boolean addCustomer(CustomerDTO customerDTO){
        Customer customer = new Customer(customerDTO.getId(), customerDTO.getName(),customerDTO.getAddress());
        customerRepo.save(customer);
        return true;
    }
    public List<CustomerDTO> getAllCustomer() {
        return customerRepo.findAll()
                .stream()
                .map(customer -> new CustomerDTO(customer.getId(),customer.getName(),customer.getAddress()))
                .collect(Collectors.toList());
    }

    public CustomerDTO updateCustomer(int id, CustomerDTO customerDTO) {
        Optional<Customer> existingCustomer = customerRepo.findById(id);

        if (existingCustomer.isPresent()){
            Customer customer = existingCustomer.get();
            customer.setName(customerDTO.getName());
            customer.setAddress(customerDTO.getAddress());

            Customer updatedCustomer = customerRepo.save(customer);
            return new CustomerDTO(updatedCustomer.getId(), updatedCustomer.getName(), updatedCustomer.getAddress());
        }
        return null;
    }

    public void deleteCustomer(int id) {
        customerRepo.deleteById(id);
    }
}
