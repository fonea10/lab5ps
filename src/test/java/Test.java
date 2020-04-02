import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.Iterator;

import model.Product;

public class Test {

	@org.junit.Test
	public void testDell() {
	
			Product p=new Product(1,"soft",3);
			Product p1=new Product(2,"soft",3);
			p.insertProduct(p1);
			p.insertProduct(p);
			p.selectALLProduct();
			int aux=p.productSize();
			 
			p.deleteProdus(1);
			
			p.selectALLProduct();
			
					if(aux+1==p.productSize()) 
						assert(true);
					  else
						  assert(false);
			 
	}
}
