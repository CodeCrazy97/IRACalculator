/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iracalculator;

/**
 *
 * @author Ethan
 */
public class IRAJPanelForm extends javax.swing.JPanel {

    /**
     * Creates new form IRAJPanelForm
     */
    public IRAJPanelForm() {
        initComponents();
        jPanel2.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        yearlyContributionsTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        balanceTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        roiTF = new javax.swing.JTextField();
        retirementAgeTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        yearsToContributeTF = new javax.swing.JTextField();
        currentAgeTF = new javax.swing.JTextField();
        inflationTF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();

        yearlyContributionsTF.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        yearlyContributionsTF.setText("5200");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Current balance:");

        balanceTF.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        balanceTF.setText("22000");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Inflation rate (%):");

        roiTF.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        roiTF.setText("10.1");

        retirementAgeTF.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        retirementAgeTF.setText("65");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setText("Years you contribute till retirement:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Yearly contributions:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("Retirement age:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Rate of return (%):");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Current age:");

        yearsToContributeTF.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        yearsToContributeTF.setText("28");

        currentAgeTF.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        currentAgeTF.setText("22");

        inflationTF.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        inflationTF.setText("2.75");
        inflationTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inflationTFActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(yearsToContributeTF)
                            .addComponent(retirementAgeTF)
                            .addComponent(currentAgeTF)
                            .addComponent(inflationTF)
                            .addComponent(roiTF)
                            .addComponent(yearlyContributionsTF)
                            .addComponent(balanceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(balanceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearlyContributionsTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roiTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inflationTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(currentAgeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(retirementAgeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearsToContributeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setText("IRA Summary by Year...");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addContainerGap(180, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void inflationTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inflationTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inflationTFActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        double realROI = Double.parseDouble(roiTF.getText());  // realROI - the IRA's interest rate minus inflation rate.
        realROI -= Double.parseDouble(inflationTF.getText());
        realROI /= 100.0;

        double balance = Double.parseDouble(balanceTF.getText());  // balance - the amount of money in the IRA
        double beginningBalance = balance;                         // beginningBalance - stores the initial amount of money in the IRA
        int age = Integer.parseInt(currentAgeTF.getText());        // age - the current age of the user in years
        int retirementAge = Integer.parseInt(retirementAgeTF.getText()); // retirementAge - age at which the user plans on retiring

        int yearsToContribute = Integer.parseInt(yearsToContributeTF.getText());  // yearsToContribute - the number of years the user will contribute to the IRA
        double yearlyContributions = Double.parseDouble(yearlyContributionsTF.getText());
        double totalContributions = 0.0;

        
        boolean interestAlert = false;  // Tells whether user has been informed of interest being greater than contributions.
        
        jPanel2.setVisible(true);  // Unhide the panel that shows an overview of IRA.
        jTextArea1.append("(Contributions shown below do not include beginning balance.)\n");
        jTextArea1.append(" Initial balance: $" + (int) balance + "\n");
        while (age != retirementAge){
            balance *= (1.0 + realROI);
            if (yearsToContribute > 0) {
                totalContributions += yearlyContributions;
                balance += yearlyContributions;
                yearsToContribute--;
            }
            age++;
            String balanceWithCommas = createStringWithCommas((int) balance);
            String contributionsWithCommas = createStringWithCommas((int) (totalContributions));
            if (!interestAlert && ((int) totalContributions + beginningBalance) < ((int) balance - beginningBalance)) {
                jTextArea1.append(" Interest beats contributions at age " + age + "!!!\n");
                jTextArea1.append(" IRA worth at age " + age + ": $" + balanceWithCommas);
                jTextArea1.append(". Contributions: $" + contributionsWithCommas + "\n");
                interestAlert = true;  
            } else if (age < retirementAge) {  
                jTextArea1.append(" IRA worth at age " + age + ": $" + balanceWithCommas);
                jTextArea1.append(". Contributions: $" + contributionsWithCommas + "\n");
            } else {  // Reached retirement age.
                jTextArea1.append("---------------------------------------------------------------------------------------");
                jTextArea1.append(" \nIRA worth at age " + age + ": $" + balanceWithCommas + ". Total contributions: $" + contributionsWithCommas);
            }
        }
        jTextArea1.append("\n");
    }//GEN-LAST:event_jButton1ActionPerformed

    public static String createStringWithCommas(int n) {
        String strWithCommas = "" + (int) n;
        int index = strWithCommas.length();
        int threeCount = 0;
        while (index >= 1) {
            if (threeCount % 3 == 0 && threeCount != 0) {
                strWithCommas = strWithCommas.substring(0, index) + "," + strWithCommas.substring(index);
            }
            index--;
            threeCount++;
        }
        return strWithCommas;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField balanceTF;
    private javax.swing.JTextField currentAgeTF;
    private javax.swing.JTextField inflationTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField retirementAgeTF;
    private javax.swing.JTextField roiTF;
    private javax.swing.JTextField yearlyContributionsTF;
    private javax.swing.JTextField yearsToContributeTF;
    // End of variables declaration//GEN-END:variables
}