package service;

import java.util.Map;

import javax.jws.WebService;
import javax.servlet.annotation.WebServlet;

import dao.DAO;
import domain.Cart;
import domain.CartItem;
import domain.Computer;

//业务类，统一为web层提供服务
//@WebServlet("/BusinessService")
@WebService
public class BusinessService {
	private DAO dao = new DAO();
	
	public Map getAllComputer(){
		return dao.getAll();
	}
	public Map getBrandComputer(String brand){
		return dao.getBrand(brand);
	}
	public Map searchComputer(String compName){
		return dao.searchComp(compName);
	}
	
	public Computer findComputer(String id){
		return dao.find(id);
	}

	public void deleteCartItem(String id, Cart cart) {
		cart.getMap().remove(id);
	}

	public void clearCart(Cart cart) {
		cart.getMap().clear();
	}

	public void changeItemQuantity(String id, String quantity, Cart cart) {
		CartItem item = cart.getMap().get(id);
		item.setQuantity(Integer.parseInt(quantity));
	}
}
