package grid.view;

import javax.swing.*;
import javax.swing.JPanel;
import grid.controller.GridController;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GridPanel extends JPanel 
{
	private GridController baseController;
	private SpringLayout baseLayout;
	
	public GridPanel(GridController baseController)
	{
		super();
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
}
