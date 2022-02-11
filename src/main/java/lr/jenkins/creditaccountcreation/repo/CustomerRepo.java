package lr.jenkins.creditaccountcreation.repo;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import lr.jenkins.creditaccountcreation.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, String> {
    void deleteCustomerByUsername(String username);

    Optional<Customer> findCustomerById(Long id);

    Optional<Customer> findCustomerByUsername(String username);
}