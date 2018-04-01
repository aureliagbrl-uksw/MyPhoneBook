package gui;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import db.DBHandler;
import db.Kontak;
import console.ConsoleUtility;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.tree.TreeSelectionModel;

/**
 *
 * @author Aurelia
 */
public class FrontMain extends javax.swing.JFrame
{

    private DBHandler db;
    private final ConsoleUtility cu = new ConsoleUtility(true, true);

    /**
     * Creates new form FrontMain
     *
     * @param x
     */
    public FrontMain(DBHandler x)
    {
        this.db = x;
        initComponents();
        updateTree();
        setVersion();
    }

    private void setVersion()
    {
        VersionLabel.setText("Version " + this.cu.MyPhoneBookVersion);
        VersionLabel.setForeground(Color.red);
        //VersionLabel.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jFrame1 = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        NamaTextField = new javax.swing.JTextField();
        HPTextField = new javax.swing.JTextField();
        KategoriTextField = new javax.swing.JTextField();
        Button = new javax.swing.JPanel();
        HapusButton = new javax.swing.JButton();
        RefreshButton = new javax.swing.JButton();
        TambahButton = new javax.swing.JButton();
        EditButton = new javax.swing.JButton();
        VersionLabel = new javax.swing.JLabel();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MyPhoneBook");
        setBackground(new java.awt.Color(253, 152, 96));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setBackground(new java.awt.Color(253, 152, 96));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/Text_Logo_Resize.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/Logo.png"))); // NOI18N

        jPanel4.setBackground(new java.awt.Color(2, 200, 191));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jTree1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Kategori");
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jTree1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTree1);
        jTree1.getAccessibleContext().setAccessibleName("KontakTree");

        jPanel1.setBackground(new java.awt.Color(253, 152, 96));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Informasi Kontak"));

        jLabel1.setText("Nama");

        jLabel2.setText("No. HP");

        jLabel4.setText("Kategori");

        NamaTextField.setEditable(false);

        HPTextField.setEditable(false);

        KategoriTextField.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(NamaTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                    .addComponent(HPTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(KategoriTextField, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NamaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HPTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KategoriTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        Button.setBackground(new java.awt.Color(253, 152, 96));
        Button.setBorder(javax.swing.BorderFactory.createTitledBorder("Kontrol"));

        HapusButton.setText("Hapus");
        HapusButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                HapusButtonActionPerformed(evt);
            }
        });

        RefreshButton.setText("Refresh");
        RefreshButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                RefreshButtonActionPerformed(evt);
            }
        });

        TambahButton.setText("Tambah");
        TambahButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                TambahButtonActionPerformed(evt);
            }
        });

        EditButton.setText("Edit");
        EditButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                EditButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonLayout = new javax.swing.GroupLayout(Button);
        Button.setLayout(ButtonLayout);
        ButtonLayout.setHorizontalGroup(
            ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RefreshButton, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(TambahButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(HapusButton, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(EditButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ButtonLayout.setVerticalGroup(
            ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(HapusButton, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(TambahButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RefreshButton, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(EditButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        VersionLabel.setText("VersionLabel");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(VersionLabel)
                .addContainerGap())
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(VersionLabel)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTree1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jTree1MouseClicked
    {//GEN-HEADEREND:event_jTree1MouseClicked
        try
        {
            DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jTree1.getSelectionPath().getLastPathComponent();
            ArrayList<Kontak> kontak = this.db.selectAllKontak();
            String selectedString = selectedNode.getUserObject().toString();

            for (int i = 0; i < kontak.size(); i++)
            {
                String nama = kontak.get(i).getNama();
                String hp = kontak.get(i).getNoHP(true);
                String kategori = kontak.get(i).getKategori();

                if (nama.equals(selectedString))
                {
                    NamaTextField.setText(selectedNode.getUserObject().toString());
                    HPTextField.setText(hp);
                    KategoriTextField.setText(kategori);
                    break;
                }
            }
        }
        catch (NullPointerException ex)
        {
            this.cu.err("Non 'Kontak' Node Selected", 2);
        }
    }//GEN-LAST:event_jTree1MouseClicked

    private void RefreshButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_RefreshButtonActionPerformed
    {//GEN-HEADEREND:event_RefreshButtonActionPerformed
        updateTree();
    }//GEN-LAST:event_RefreshButtonActionPerformed

    private void TambahButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_TambahButtonActionPerformed
    {//GEN-HEADEREND:event_TambahButtonActionPerformed
        updateTree();
        TambahKontak tk = new TambahKontak(this.db);
        tk.setVisible(true);
        updateTree();
    }//GEN-LAST:event_TambahButtonActionPerformed

    private void HapusButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_HapusButtonActionPerformed
    {//GEN-HEADEREND:event_HapusButtonActionPerformed
        try
        {
            DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jTree1.getSelectionPath().getLastPathComponent();
            ArrayList<Kontak> kontak = this.db.selectAllKontak();
            String selectedString = selectedNode.getUserObject().toString();

            for (int i = 0; i < kontak.size(); i++)
            {
                String nama = kontak.get(i).getNama();
                String hp = kontak.get(i).getNoHP(true);
                String kategori = kontak.get(i).getKategori();

                if (nama.equals(selectedString))
                {
                    NamaTextField.setText(selectedNode.getUserObject().toString());
                    HPTextField.setText(hp);
                    KategoriTextField.setText(kategori);
                    Object[] options =
                    {
                        "Ya",
                        "Tidak"
                    };

                    int n = JOptionPane.showOptionDialog(this,
                            ("Apakah Anda Yakin Menghapus ?"),
                            "Konfirmasi Hapus Data",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            options,
                            options[0]);

                    if (n == 0)
                    {
                        if (this.db.deleteKontak(kontak.get(i).getNoHP()) == true)
                        {
                            JOptionPane.showMessageDialog(this,
                                    "Data Berhasil Dihapus !");
                        }
                    }

                    break;
                }
            }

            updateTree();
        }
        catch (NullPointerException ex)
        {
            this.cu.err("Non 'Kontak' Node Selected", 2);
        }
    }//GEN-LAST:event_HapusButtonActionPerformed

    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_EditButtonActionPerformed
    {//GEN-HEADEREND:event_EditButtonActionPerformed
        try
        {
            DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jTree1.getSelectionPath().getLastPathComponent();
            ArrayList<Kontak> kontak = this.db.selectAllKontak();
            String selectedString = selectedNode.getUserObject().toString();

            for (int i = 0; i < kontak.size(); i++)
            {
                String nama = kontak.get(i).getNama();
                String hp = kontak.get(i).getNoHP(true);
                String kategori = kontak.get(i).getKategori();

                if (nama.equals(selectedString))
                {
                    NamaTextField.setText(selectedNode.getUserObject().toString());
                    HPTextField.setText(hp);
                    KategoriTextField.setText(kategori);

                    EditKontak ek = new EditKontak(kontak.get(i), this.db);
                    ek.setVisible(true);

                    break;
                }
            }

            updateTree();
        }
        catch (NullPointerException ex)
        {
            this.cu.err("Non 'Kontak' Node Selected", 2);
        }
    }//GEN-LAST:event_EditButtonActionPerformed

    private void updateTree()
    {
        this.cu.err("Updating List");
        jTree1.clearSelection();

        int tinggi = jTree1.getHeight();
        ArrayList<Integer> expandedRow = new ArrayList<>();

        for (int i = 0; i < tinggi; i++)
        {
            if (jTree1.isCollapsed(i) != true)
            {
                expandedRow.add(i);
            }
        }

        DefaultTreeModel dm = (DefaultTreeModel) jTree1.getModel();
        DefaultMutableTreeNode kategori = (DefaultMutableTreeNode) dm.getRoot();

        kategori.removeAllChildren(); // delete semua sub categori;

        ArrayList<Kontak> k = this.db.selectAllKontak();
        ArrayList<String> ks = new ArrayList<>();

        for (Kontak i : k)
        {
            ks.add(i.getKategori());
        }
        ks = this.cu.removeDuplicates(ks);

        for (String i : ks)
        {
            DefaultMutableTreeNode kat = new DefaultMutableTreeNode(i);
            for (Kontak j : k)
            {
                if (j.getKategori().equals(i))
                {
                    kat.add(new DefaultMutableTreeNode(j.getNama()));
                }
            }

            kategori.add(kat);
        }

        dm.reload();
        for (int i = 0; i < expandedRow.size(); i++)
        {
            jTree1.expandRow(expandedRow.get(i));
        }
        this.cu.err("List Updated !", 0);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(FrontMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(FrontMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(FrontMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(FrontMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Button;
    private javax.swing.JButton EditButton;
    private javax.swing.JTextField HPTextField;
    private javax.swing.JButton HapusButton;
    private javax.swing.JTextField KategoriTextField;
    private javax.swing.JTextField NamaTextField;
    private javax.swing.JButton RefreshButton;
    private javax.swing.JButton TambahButton;
    private javax.swing.JLabel VersionLabel;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}
