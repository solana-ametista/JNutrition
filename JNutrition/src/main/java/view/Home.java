
package view;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.Food;
import model.Client;
public class Home extends javax.swing.JFrame {
    
    DefaultListModel<String> listModel;
    List<Client> listOfClients;
    
    public Home() {
        initComponents();
        this.setResizable(false);
        this.listOfClients = new ArrayList<>();
        this.listModel = new DefaultListModel<>();
        this.clientJList.setModel(listModel);
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        leftPane = new javax.swing.JSeparator();
        addClientButton = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        clientsPane = new javax.swing.JPanel();
        clientsLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        clientJList = new javax.swing.JList<>();
        showDietButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JNutrition");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(52, 73, 94));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("content"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(142, 68, 173));
        jPanel1.setForeground(new java.awt.Color(153, 0, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(230, 500));
        jPanel1.setRequestFocusEnabled(false);

        title.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("JNUTRITION");

        leftPane.setBackground(new java.awt.Color(0, 0, 0));

        addClientButton.setBackground(new java.awt.Color(153, 0, 153));
        addClientButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addClientButtonMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Add New Client");

        javax.swing.GroupLayout addClientButtonLayout = new javax.swing.GroupLayout(addClientButton);
        addClientButton.setLayout(addClientButtonLayout);
        addClientButtonLayout.setHorizontalGroup(
            addClientButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addClientButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addClientButtonLayout.setVerticalGroup(
            addClientButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addClientButtonLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(addClientButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(leftPane, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(addClientButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(title)
                .addGap(18, 18, 18)
                .addComponent(leftPane, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addClientButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(225, Short.MAX_VALUE))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setViewportView(clientsPane);

        clientsPane.setBackground(new java.awt.Color(255, 255, 255));
        clientsPane.setAutoscrolls(true);

        clientsLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clientsLabel.setText("CLIENTS");

        clientJList.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jScrollPane3.setViewportView(clientJList);

        showDietButton.setBackground(new java.awt.Color(204, 0, 204));
        showDietButton.setText("Show Diet");
        showDietButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showDietButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout clientsPaneLayout = new javax.swing.GroupLayout(clientsPane);
        clientsPane.setLayout(clientsPaneLayout);
        clientsPaneLayout.setHorizontalGroup(
            clientsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientsPaneLayout.createSequentialGroup()
                .addGroup(clientsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(clientsPaneLayout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(clientsLabel))
                    .addGroup(clientsPaneLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(clientsPaneLayout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(showDietButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        clientsPaneLayout.setVerticalGroup(
            clientsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientsPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clientsLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showDietButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(clientsPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void addClientButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addClientButtonMouseClicked
        /*JLabel label = new JLabel();
        JPanel j = new JPanel();
        
        label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setText("Daniel");
        j.setSize(100, 100);
        j.setVisible(true);
        j.setPreferredSize(new Dimension(100,100));
        javax.swing.GroupLayout jLayout = new javax.swing.GroupLayout(j);
        j.setLayout(jLayout);
        j.setBackground(Color.red);
        jLayout.setHorizontalGroup(
            jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(label)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jLayout.setVerticalGroup(
            jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(label)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        j.setMaximumSize(new Dimension(100,100));
        
     */
     
        
        newClientDialog newClient = new newClientDialog(this);
        Client n = new Client("Daniel");
        addNewClient(n);
        this.listModel.addElement(n.toString());
        System.out.println("Fechou");
      
    }//GEN-LAST:event_addClientButtonMouseClicked

    private void showDietButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showDietButtonActionPerformed
       int i= this.clientJList.getSelectedIndex();
       System.out.println(getClient(i).toString());
    }//GEN-LAST:event_showDietButtonActionPerformed

    private void addNewClient(Client e){
        this.listOfClients.add(e);
        //Insert into database
    }
    private void removeClient(int index){
            this.listOfClients.remove(index);
    }
    private Client getClient(int index){
            return this.listOfClients.get(index);
    }
    public static void main(String args[]) {
       
        
            JFrame home = new Home();
            home.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addClientButton;
    private javax.swing.JList<String> clientJList;
    private javax.swing.JLabel clientsLabel;
    private javax.swing.JPanel clientsPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator leftPane;
    private javax.swing.JButton showDietButton;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

    
}
