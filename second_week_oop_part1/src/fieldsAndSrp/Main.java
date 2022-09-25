package fieldsAndSrp;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product();
		Product product2 = new Product(2, "Mouse", "Asus WT425 Kablosuz Optik Sessiz Tıklama Özellikli Siyah Mouse","electronic", "red", 350.0, 54);
		product1.setId(1);
		product1.setName("Notebook");
		product1.setDescription("Lenovo IdeaPad 3 Intel Core i5 10210U 8GB 512GB SSD Freedos 15.6 FHD Taşınabilir Bilgisayar");
		product1.setCategoryName("electronic");
		product1.setColor("white");
		product1.setPrice(12000);
		product1.setStockAmount(15);
		
		ProductManager productManager = new ProductManager();
		productManager.create(product2);
		productManager.read(product2);
		productManager.update(product2);
		productManager.delete(product2);
		
	}

}
