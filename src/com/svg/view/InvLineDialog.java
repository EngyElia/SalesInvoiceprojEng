
package com.svg.view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class InvLineDialog extends JDialog{
    private JTextField itemName;
    private JTextField itemCount;
    private JTextField itemPrice;
    private JLabel nameLbl;
    private JLabel countLbl;
    private JLabel priceLbl;
    private JButton okBtn;
    private JButton cancelBtn;
    
    public InvLineDialog(InvoiceFrame frame) {
        itemName = new JTextField(20);
        nameLbl = new JLabel("Item Name");
        
        itemCount = new JTextField(20);
        countLbl = new JLabel("Item Count");
        
        itemPrice = new JTextField(20);
        priceLbl = new JLabel("Item Price");
        
        okBtn = new JButton("OK");
        cancelBtn = new JButton("Cancel");
        
        okBtn.setActionCommand("createLineOK");
        cancelBtn.setActionCommand("createLineCancel");
        
        okBtn.addActionListener(frame.getListener());
        cancelBtn.addActionListener(frame.getListener());
        setLayout(new GridLayout(4, 2));
        
        add(nameLbl);
        add(itemName);
        add(countLbl);
        add(itemCount);
        add(priceLbl);
        add(itemPrice);
        add(okBtn);
        add(cancelBtn);
        
        pack();
    }

    public JTextField getItemName() {
        return itemName;
    }

    public JTextField getItemCount() {
        return itemCount;
    }

    public JTextField getItemPrice() {
        return itemPrice;
    }
}
