package com.ip.phase2;

public class Product {
	private Integer pid;
	private String pname;
	private Double price;
	private Integer stock;

	public Product() {

	}

	public Product(Integer pid, String pname, Double price, Integer stock) {
		// super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.stock = stock;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}
	
	@Override
    public int hashCode() {
		System.out.println(this.getPid());
      return this.getPid();
    }
 
    @Override
    public boolean equals(Object obj) {
	Product p = null;
        if(obj instanceof Product){
	        p = (Product) obj;
        }
        if(this.getPid() == p.getPid()){
	        return true;
        } else {
	        return false;
        }  
     }

}
