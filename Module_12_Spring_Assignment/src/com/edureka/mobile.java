

 
package com.edureka;
import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

 
public class mobile {
 int id;
 public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
String manuf_name;
 int price;
 String color;
public String getManuf_name() {
	return manuf_name;
}
public void setManuf_name(String manuf_name) {
	this.manuf_name = manuf_name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
 


}
