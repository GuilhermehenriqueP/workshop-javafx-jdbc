package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable{
	
	@FXML
	private MenuItem menuItemSeller;
	
	@FXML
	private MenuItem menuItemDepartament;
	
	@FXML
	private MenuItem menuItemAbout;
	
	@FXML
	public void onMenuItemSellerAction() {
		System.out.println("OnMenuItemSellerAction");
	}
	
	@FXML
	public void onMenuItemDepartamentAction() {
		System.out.println("onMenuItemDepartamentAction");
	}
	
	@FXML
	public void onMenuItemAboutAction() {
		System.out.println("OnMenuItemAboutAction");
	}
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO Auto-generated method stub
		
	}

}
