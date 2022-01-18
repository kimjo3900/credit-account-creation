package lr.jenkins.creditaccountcreation.model;

import java.io.Serializable;
import java.util.Random;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class MyGenerator implements IdentifierGenerator {
    public static final String generatorName = "myGenerator";

    @Override
    public Serializable generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object object) throws HibernateException {
        Random rand = new Random();
		String id = "";
		for (int i = 0; i < 9; i++) {
			int n = rand.nextInt(10) + 0;
			id += Integer.toString(n);
		}
		return Long.parseLong(id);
    }
}
