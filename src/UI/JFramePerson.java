package UI;

import classes.Person;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 * @author ZainLowie
 */
public class JFramePerson extends javax.swing.JFrame {

   
    public JFramePerson() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jButtonNew = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel7 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jTextFieldFirstname = new javax.swing.JTextField();
        jTextFieldLastname = new javax.swing.JTextField();
        jTextFieldMiddlename = new javax.swing.JTextField();
        jTextFieldAge = new javax.swing.JTextField();
        jTextFieldCivilStatus = new javax.swing.JTextField();
        jTextFieldBarangay = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jPanel9 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jTextFieldBirthdate = new javax.swing.JTextField();
        jTextFieldEducation = new javax.swing.JTextField();
        jTextFieldTribe = new javax.swing.JTextField();
        jTextFieldOccupation = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jRadioButtonMale = new javax.swing.JRadioButton();
        jPanel12 = new javax.swing.JPanel();
        jRadioButtonFemale = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFamily = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Form"); // NOI18N

        jToolBar1.setRollover(true);
        jToolBar1.setName("jToolBar1"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(desktopapplication.DesktopApplication.class).getContext().getResourceMap(JFramePerson.class);
        jButtonNew.setText(resourceMap.getString("jButtonNew.text")); // NOI18N
        jButtonNew.setFocusable(false);
        jButtonNew.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonNew.setName("jButtonNew"); // NOI18N
        jButtonNew.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButtonNew);

        jButtonSave.setText(resourceMap.getString("jButtonSave.text")); // NOI18N
        jButtonSave.setFocusable(false);
        jButtonSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSave.setName("jButtonSave"); // NOI18N
        jButtonSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButtonSave);

        jButtonUpdate.setText(resourceMap.getString("jButtonUpdate.text")); // NOI18N
        jButtonUpdate.setFocusable(false);
        jButtonUpdate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonUpdate.setName("jButtonUpdate"); // NOI18N
        jButtonUpdate.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButtonUpdate);

        jButtonDelete.setText(resourceMap.getString("jButtonDelete.text")); // NOI18N
        jButtonDelete.setFocusable(false);
        jButtonDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonDelete.setName("jButtonDelete"); // NOI18N
        jButtonDelete.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButtonDelete);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setLayout(new java.awt.GridLayout(2, 0));

        jPanel2.setName("jPanel2"); // NOI18N
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jPanel4.setName("jPanel4"); // NOI18N
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel6.setName("jPanel6"); // NOI18N
        jPanel6.setLayout(new java.awt.GridLayout(9, 0));

        jSeparator1.setName("jSeparator1"); // NOI18N
        jPanel6.add(jSeparator1);

        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N
        jPanel6.add(jLabel1);

        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N
        jPanel6.add(jLabel2);

        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N
        jPanel6.add(jLabel3);

        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N
        jPanel6.add(jLabel4);

        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N
        jPanel6.add(jLabel5);

        jLabel6.setText(resourceMap.getString("jLabel6.text")); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N
        jPanel6.add(jLabel6);

        jLabel14.setText(resourceMap.getString("jLabel14.text")); // NOI18N
        jLabel14.setName("jLabel14"); // NOI18N
        jPanel6.add(jLabel14);

        jSeparator5.setName("jSeparator5"); // NOI18N
        jPanel6.add(jSeparator5);

        jPanel4.add(jPanel6, java.awt.BorderLayout.LINE_START);

        jPanel7.setName("jPanel7"); // NOI18N
        jPanel7.setLayout(new java.awt.GridLayout(9, 0));

        jSeparator2.setName("jSeparator2"); // NOI18N
        jPanel7.add(jSeparator2);

        jTextFieldFirstname.setText(resourceMap.getString("jTextFieldFirstname.text")); // NOI18N
        jTextFieldFirstname.setName("jTextFieldFirstname"); // NOI18N
        jPanel7.add(jTextFieldFirstname);

        jTextFieldLastname.setText(resourceMap.getString("jTextFieldLastname.text")); // NOI18N
        jTextFieldLastname.setName("jTextFieldLastname"); // NOI18N
        jPanel7.add(jTextFieldLastname);

        jTextFieldMiddlename.setText(resourceMap.getString("jTextFieldMiddlename.text")); // NOI18N
        jTextFieldMiddlename.setName("jTextFieldMiddlename"); // NOI18N
        jPanel7.add(jTextFieldMiddlename);

        jTextFieldAge.setText(resourceMap.getString("jTextFieldAge.text")); // NOI18N
        jTextFieldAge.setName("jTextFieldAge"); // NOI18N
        jPanel7.add(jTextFieldAge);

        jTextFieldCivilStatus.setText(resourceMap.getString("jTextFieldCivilStatus.text")); // NOI18N
        jTextFieldCivilStatus.setName("jTextFieldCivilStatus"); // NOI18N
        jPanel7.add(jTextFieldCivilStatus);

        jTextFieldBarangay.setText(resourceMap.getString("jTextFieldBarangay.text")); // NOI18N
        jTextFieldBarangay.setName("jTextFieldBarangay"); // NOI18N
        jPanel7.add(jTextFieldBarangay);

        jLabel15.setText(resourceMap.getString("jLabel15.text")); // NOI18N
        jLabel15.setName("jLabel15"); // NOI18N
        jPanel7.add(jLabel15);

        jSeparator6.setName("jSeparator6"); // NOI18N
        jPanel7.add(jSeparator6);

        jPanel4.add(jPanel7, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);

        jPanel5.setName("jPanel5"); // NOI18N
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel8.setName("jPanel8"); // NOI18N
        jPanel8.setLayout(new java.awt.GridLayout(9, 0));

        jSeparator4.setName("jSeparator4"); // NOI18N
        jPanel8.add(jSeparator4);

        jLabel7.setText(resourceMap.getString("jLabel7.text")); // NOI18N
        jLabel7.setName("jLabel7"); // NOI18N
        jPanel8.add(jLabel7);

        jLabel9.setText(resourceMap.getString("jLabel9.text")); // NOI18N
        jLabel9.setName("jLabel9"); // NOI18N
        jPanel8.add(jLabel9);

        jLabel10.setText(resourceMap.getString("jLabel10.text")); // NOI18N
        jLabel10.setName("jLabel10"); // NOI18N
        jPanel8.add(jLabel10);

        jLabel11.setText(resourceMap.getString("jLabel11.text")); // NOI18N
        jLabel11.setName("jLabel11"); // NOI18N
        jPanel8.add(jLabel11);

        jLabel12.setText(resourceMap.getString("jLabel12.text")); // NOI18N
        jLabel12.setName("jLabel12"); // NOI18N
        jPanel8.add(jLabel12);

        jLabel13.setText(resourceMap.getString("jLabel13.text")); // NOI18N
        jLabel13.setName("jLabel13"); // NOI18N
        jPanel8.add(jLabel13);

        jLabel16.setText(resourceMap.getString("jLabel16.text")); // NOI18N
        jLabel16.setName("jLabel16"); // NOI18N
        jPanel8.add(jLabel16);

        jSeparator7.setName("jSeparator7"); // NOI18N
        jPanel8.add(jSeparator7);

        jPanel5.add(jPanel8, java.awt.BorderLayout.LINE_START);

        jPanel9.setName("jPanel9"); // NOI18N
        jPanel9.setLayout(new java.awt.GridLayout(9, 0));

        jSeparator3.setName("jSeparator3"); // NOI18N
        jPanel9.add(jSeparator3);

        jTextFieldBirthdate.setText(resourceMap.getString("jTextFieldBirthdate.text")); // NOI18N
        jTextFieldBirthdate.setName("jTextFieldBirthdate"); // NOI18N
        jPanel9.add(jTextFieldBirthdate);

        jTextFieldEducation.setText(resourceMap.getString("jTextFieldEducation.text")); // NOI18N
        jTextFieldEducation.setName("jTextFieldEducation"); // NOI18N
        jPanel9.add(jTextFieldEducation);

        jTextFieldTribe.setText(resourceMap.getString("jTextFieldTribe.text")); // NOI18N
        jTextFieldTribe.setName("jTextFieldTribe"); // NOI18N
        jPanel9.add(jTextFieldTribe);

        jTextFieldOccupation.setText(resourceMap.getString("jTextFieldOccupation.text")); // NOI18N
        jTextFieldOccupation.setName("jTextFieldOccupation"); // NOI18N
        jPanel9.add(jTextFieldOccupation);

        jPanel10.setName("jPanel10"); // NOI18N
        jPanel10.setLayout(new java.awt.GridLayout());

        jPanel11.setName("jPanel11"); // NOI18N
        jPanel11.setLayout(new java.awt.BorderLayout());

        jRadioButtonMale.setText(resourceMap.getString("jRadioButtonMale.text")); // NOI18N
        jRadioButtonMale.setName("jRadioButtonMale"); // NOI18N
        jPanel11.add(jRadioButtonMale, java.awt.BorderLayout.CENTER);

        jPanel10.add(jPanel11);

        jPanel12.setName("jPanel12"); // NOI18N
        jPanel12.setLayout(new java.awt.BorderLayout());

        jRadioButtonFemale.setText(resourceMap.getString("jRadioButtonFemale.text")); // NOI18N
        jRadioButtonFemale.setName("jRadioButtonFemale"); // NOI18N
        jPanel12.add(jRadioButtonFemale, java.awt.BorderLayout.CENTER);

        jPanel10.add(jPanel12);

        jPanel9.add(jPanel10);

        jLabel8.setText(resourceMap.getString("jLabel8.text")); // NOI18N
        jLabel8.setName("jLabel8"); // NOI18N
        jPanel9.add(jLabel8);

        jLabel17.setText(resourceMap.getString("jLabel17.text")); // NOI18N
        jLabel17.setName("jLabel17"); // NOI18N
        jPanel9.add(jLabel17);

        jSeparator8.setName("jSeparator8"); // NOI18N
        jPanel9.add(jSeparator8);

        jPanel5.add(jPanel9, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5);

        jPanel1.add(jPanel2);

        jPanel3.setName("jPanel3"); // NOI18N
        jPanel3.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTableFamily.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableFamily.setName("jTableFamily"); // NOI18N
        jScrollPane1.setViewportView(jTableFamily);

        jPanel3.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel3);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePerson().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonNew;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButtonFemale;
    private javax.swing.JRadioButton jRadioButtonMale;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTable jTableFamily;
    private javax.swing.JTextField jTextFieldAge;
    private javax.swing.JTextField jTextFieldBarangay;
    private javax.swing.JTextField jTextFieldBirthdate;
    private javax.swing.JTextField jTextFieldCivilStatus;
    private javax.swing.JTextField jTextFieldEducation;
    private javax.swing.JTextField jTextFieldFirstname;
    private javax.swing.JTextField jTextFieldLastname;
    private javax.swing.JTextField jTextFieldMiddlename;
    private javax.swing.JTextField jTextFieldOccupation;
    private javax.swing.JTextField jTextFieldTribe;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

    Person person = new Person();

     public void insertMember(){

        person.setFirstname(jTextFieldFirstname.getText().trim());
        person.setLastname(jTextFieldLastname.getText().trim());
        person.setMiddlename(jTextFieldMiddlename.getText().trim());

         if (jRadioButtonMale.isSelected()) {
            person.setGender("Male");
        } else if (jRadioButtonFemale.isSelected()) {
            person.setGender("Female");
        }
        person.setBirthdate(jTextFieldBirthdate.getText().trim());
        person.setAgeID(Integer.parseInt(jTextFieldAge.getText().trim()));
        person.setEducation(jTextFieldEducation.getText().trim());
        person.setBarangay(jTextFieldBarangay.getText().trim());
        person.setOccupation(jTextFieldOccupation.getText().trim());
        person.setCivilStatus(jTextFieldCivilStatus.getText().trim());
        person.setTribe(jTextFieldTribe.getText().trim());

        person.add();

        selectAllMember();
    }
public void updateMember(){

        person.setFirstname(jTextFieldFirstname.getText().trim());
        person.setLastname(jTextFieldLastname.getText().trim());
        person.setMiddlename(jTextFieldMiddlename.getText().trim());

         if (jRadioButtonMale.isSelected()) {
            person.setGender("Male");
        } else if (jRadioButtonFemale.isSelected()) {
            person.setGender("Female");
        }
        person.setBirthdate(jTextFieldBirthdate.getText().trim());
        person.setAgeID(Integer.parseInt(jTextFieldAge.getText().trim()));
        person.setEducation(jTextFieldEducation.getText().trim());
        person.setBarangay(jTextFieldBarangay.getText().trim());
        person.setOccupation(jTextFieldOccupation.getText().trim());
        person.setCivilStatus(jTextFieldCivilStatus.getText().trim());
        person.setTribe(jTextFieldTribe.getText().trim());

        person.update();

        selectAllMember();
    }
 private void selectAllMember() {

        memberTable.setRowCount(0);
        //person.selects();

       for (int a = 0; a < person.getData().size(); a++) {
            memberTable.addRow((Vector) person.getData().get(a));
        }
             
         }

    DefaultTableModel memberTable = new DefaultTableModel() {

        public Class getColumnClass(int columnIndex) {
            if (columnIndex == 5) {
                return Boolean.class;
            } else {
                return Object.class;
            }
        }

        //Note that the data/cell address is constant,
        //no matter where the cell appears onscreen.

        public boolean isCellEditable(int row, int col) {
            if (col < 10) {
                return false;
            } else {
                return true;
            }
        }
    }; //end of Instantiation

private TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(memberTable);

private void setMemberTable() {
        //
        String[] columnNames = {
            "id",
            "Lastname",
            "Firstname",
            "Middlename",
            "Gender",
            "Civil Status",
            "Birthdate",
            "Age",
            "Education",
            "Barangay",
            "Tribe",
            "Occupation",
           
           };

        jTableFamily = new javax.swing.JTable(memberTable);
        jTableFamily.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTableFamily.setShowGrid(false);
        jTableFamily.setFillsViewportHeight(true);
        jTableFamily.getTableHeader().setReorderingAllowed(false);
        jTableFamily.addMouseListener((MouseListener) this);
        jTableFamily.setRowSelectionAllowed(true);
        jTableFamily.setAutoCreateRowSorter(true);
        jTableFamily.setRowSorter(sorter);
        jScrollPane1.setViewportView(jTableFamily);
        jTableFamily.setBackground(Color.gray);

        JTableHeader header =jTableFamily.getTableHeader();
        header.setBackground(Color.LIGHT_GRAY);

        //...set columnNames in table columns
        for (int i = 0; i < columnNames.length;) {
            memberTable.addColumn(columnNames[i]);
            i++;
        }

        TableColumn[] column = new TableColumn[100];
        //...
        column[0] = jTableFamily.getColumnModel().getColumn(0);
        column[0].setPreferredWidth(50);

        column[1] = jTableFamily.getColumnModel().getColumn(1);
        column[1].setPreferredWidth(80);

        column[2] = jTableFamily.getColumnModel().getColumn(2);
        column[2].setPreferredWidth(100);

        TableColumn hidden1 = jTableFamily.getColumnModel().getColumn(0);
        hidden1.setMinWidth(0);
        hidden1.setPreferredWidth(0);
        hidden1.setMaxWidth(0);

   }

public void mouseClicked(MouseEvent e) {

        if (e.getSource() == jTableFamily) {
            if (e.getButton() == MouseEvent.BUTTON1) {
                if (e.getClickCount() == 2) {

                    int row = jTableFamily.getSelectedRow();
                    if (row != -1) {

                        Object id = jTableFamily.getValueAt(row, 0);
                        Object lastname = jTableFamily.getValueAt(row, 1);
                        Object firstname = jTableFamily.getValueAt(row, 2);
                        Object middlename = jTableFamily.getValueAt(row, 3);
                        Object gender = jTableFamily.getValueAt(row, 4);
                        Object civilStatus = jTableFamily.getValueAt(row, 5);
                        Object birthdate = jTableFamily.getValueAt(row, 6);
                        Object age = jTableFamily.getValueAt(row, 7);
                        Object education = jTableFamily.getValueAt(row, 8);
                        Object barangay = jTableFamily.getValueAt(row, 9);
                        Object tribe = jTableFamily.getValueAt(row, 10);
                        Object occupation = jTableFamily.getValueAt(row, 11);

                        //...Cast to String below
                        person.setId(Integer.parseInt(id.toString().trim()));
                        jTextFieldFirstname.setText(firstname.toString());
                        jTextFieldLastname.setText(lastname.toString());
                        jTextFieldMiddlename.setText(middlename.toString());

                        if (gender.equals("Male")) {
                            jRadioButtonMale.setSelected(true);
                            jRadioButtonFemale.setSelected(false);
                        } else if (gender.equals("Female")) {
                            jRadioButtonFemale.setSelected(true);
                            jRadioButtonMale.setSelected(false);
                        }
                       
                       jTextFieldBirthdate.setText(birthdate.toString());
                       jTextFieldAge.setText(age.toString().trim());
                       jTextFieldEducation.setText(education.toString());
                       jTextFieldBarangay.setText(barangay.toString());
                       jTextFieldOccupation.setText(occupation.toString());
                       jTextFieldCivilStatus.setText(civilStatus.toString());
                       jTextFieldTribe.setText(tribe.toString());

                       

                    }
                }
            }
        }
    }

    public void mousePressed(MouseEvent e) {

    }

    public void mouseReleased(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }


        void refresh(){

        jTextFieldFirstname.setText("");
        jTextFieldLastname.setText("");
        jTextFieldMiddlename.setText("");

        jRadioButtonFemale.setSelected(false);
        jRadioButtonMale.setSelected(false);
        jTextFieldAge.setText("");

      
  }
}
