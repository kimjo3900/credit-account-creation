package lr.jenkins.creditaccountcreation.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import lr.jenkins.creditaccountcreation.repo.CustomerRepo;
import lr.jenkins.creditaccountcreation.model.Customer;
import lr.jenkins.creditaccountcreation.exception.UserNotFoundException;
import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

@Service
public class CustomerService {
    private final CustomerRepo customerRepo;

    @Autowired
    public CustomerService(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    public Customer addCustomer(Customer customer) {
        customer.setCustomerCode(UUID.randomUUID().toString());
        return customerRepo.save(customer);
    }

    public List<Customer> findAllCustomers() {
        return customerRepo.findAll();
    }

    public Customer updateCustomer(Customer customer) {
        return customerRepo.save(customer);
    }

    public Customer findCustomerById(Long id) {
        return customerRepo.findCustomerById(id)
            .orElseThrow(() -> new UserNotFoundException("User with id " + id + " was not found"));
    }

    public Customer findCustomerByUsername(String username) {
        return customerRepo.findCustomerByUsername(username)
            .orElseThrow(() -> new UserNotFoundException("User with username " + username + " was not found"));
    }

    @Transactional
    public void deleteCustomer(String username) {
        customerRepo.deleteCustomerByUsername(username);
    }
}
