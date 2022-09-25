package fieldsAndSrp;

public class ProductManager {
	// methods JDBC
	public void create(Product product) {
		System.out.println(product.getId() + " id\'li " + product.getName() + " isimli ürün eklendi");
	}
	public void read(Product product) {
		System.out.println(product.getId() + " id\'li " + product.getName() + " isimli ürün getirildi");
	}
	public void update(Product product) {
		System.out.println(product.getId()+ " id\'li " + product.getName() + " isimli ürün güncellendi");
	}
	public void delete(Product product) {
		System.out.println(product.getId() + " id\'li " + product.getName() + " isimli ürün silindi");
	}
}
