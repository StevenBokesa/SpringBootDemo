package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product   
{  
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="id")
private int id;  

@Column(name="pname")
private String pname;  

@Column(name="batchno")
private String batchno;

@Column(name="price")
private double price;  

@Column(name="noofproduct")
private int noofproduct;  
//default constructor  
public Product()  
{  
      
}  
//constructor using fields  
public Product(int id, String pname, String batchno, double price, int noofproduct)   
{  
super();  
this.id = id;  
this.pname = pname;  
this.batchno = batchno;  
this.price = price;  
this.noofproduct = noofproduct;  
}  

//getters and setters  
public int getId()   
{  
return id;  
}  
public void setId(int id)   
{  
this.id = id;  
}  
public String getPname()   
{  
return pname;  
}  
public void setPname(String pname)   
{  
this.pname = pname;  
}  
public String getBatchno()   
{  
return batchno;  
}  
public void setBatchno(String batchno)   
{  
this.batchno = batchno;  
}  
public double getPrice()   
{  
return price;  
}  
public void setPrice(double price)   
{  
this.price = price;  
}  
public int getNoofproduct()   
{  
return noofproduct;  
}  
public void setNoofproduct(int noofproduct)   
{  
this.noofproduct = noofproduct;  
}  
}  