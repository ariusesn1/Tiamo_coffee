/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package gui;

import DTO.LoaiMon;
import DTO.ThucDon;
import Table.TableCustom;
import help.MyCombobox;
import help.ThongBao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NGUYEN VAN TRUONG
 */
public class jdlThucDonMon extends javax.swing.JDialog {

    /**
     * Creates new form jdlThucDonMon
     */
    public jdlThucDonMon(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Table.TableCustom.apply(jScrollPane1, TableCustom.TableType.DEFAULT);
        Table.TableCustom.apply(jScrollPane3, TableCustom.TableType.DEFAULT);
        txtGiaBan.setText("0");
        loadThucDon();
        loadLoaiMon();
        
            
        setIconImage(XImage.XImage.getAppIcon());
        setTitle("TIAMO COFFEE");

        ArrayList<LoaiMon> arrLSP = BLL.BLLLoaiMon.GetAll();
        BLL.BLLLoaiMon.DoVaoCombobox(arrLSP, cbbTenLoai);
    }
    
    public void loadThucDon(){
        ArrayList<ThucDon> arrSP = BLL.BLLThucDon.GetAll();
        BLL.BLLThucDon.DoVaoTableThucDon(arrSP, tbThucDon);
    }
    
    public void loadLoaiMon(){
        ArrayList<LoaiMon> arrSP = BLL.BLLLoaiMon.GetAll();
        BLL.BLLLoaiMon.DoVaoTableLoaiSP(arrSP, tbLoai);
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
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMaMon = new javax.swing.JTextField();
        txtTenMon = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbbTenLoai = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cbbDV = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtGiaBan = new javax.swing.JTextField();
        btnThemMon = new javax.swing.JButton();
        btnXoaMon = new javax.swing.JButton();
        btnSuaMon = new javax.swing.JButton();
        btnRefeshMon = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbThucDon = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTenLoai = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtMaLoai = new javax.swing.JTextField();
        btnRefesh = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbLoai = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(195, 211, 192));

        jPanel4.setBackground(new java.awt.Color(195, 211, 192));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel3.setText("Mã món:");

        jLabel4.setText("Tên món:");

        txtMaMon.setBackground(new java.awt.Color(195, 211, 192));
        txtMaMon.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        txtTenMon.setBackground(new java.awt.Color(195, 211, 192));
        txtTenMon.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel5.setText("Tên loại:");

        jLabel6.setText("Đơn vị:");

        cbbDV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ly", "Dĩa", "Hộp", "Chai" }));

        jLabel7.setText("Giá bán:");

        txtGiaBan.setBackground(new java.awt.Color(195, 211, 192));
        txtGiaBan.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        btnThemMon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/add_1.png"))); // NOI18N
        btnThemMon.setText("Thêm");
        btnThemMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemMonActionPerformed(evt);
            }
        });

        btnXoaMon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/delete.png"))); // NOI18N
        btnXoaMon.setText("Xóa");
        btnXoaMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaMonActionPerformed(evt);
            }
        });

        btnSuaMon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/hammer.png"))); // NOI18N
        btnSuaMon.setText("Sửa");
        btnSuaMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaMonActionPerformed(evt);
            }
        });

        btnRefeshMon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/refresh_1.png"))); // NOI18N
        btnRefeshMon.setText("Làm mới");
        btnRefeshMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefeshMonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaMon)
                            .addComponent(cbbTenLoai, 0, 188, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTenMon)
                            .addComponent(cbbDV, 0, 183, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(btnThemMon)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoaMon)
                        .addGap(18, 18, 18)
                        .addComponent(btnSuaMon)
                        .addGap(18, 18, 18)
                        .addComponent(btnRefeshMon)))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaMon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenMon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbbTenLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbbDV))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnThemMon, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(btnXoaMon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSuaMon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRefeshMon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        tbThucDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã món", "Tên món", "Tên loại", "Đơn vị", "Giá bán"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbThucDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbThucDonMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbThucDon);

        jPanel2.setBackground(new java.awt.Color(195, 211, 192));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Thông tin", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        jLabel1.setText("Tên Loại:");

        txtTenLoai.setBackground(new java.awt.Color(195, 211, 192));
        txtTenLoai.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/add_1.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/delete.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/hammer.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        jLabel2.setText("Mã loại:");

        txtMaLoai.setBackground(new java.awt.Color(195, 211, 192));
        txtMaLoai.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        btnRefesh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/refresh_1.png"))); // NOI18N
        btnRefesh.setText("Làm mới");
        btnRefesh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefeshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTenLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnThem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnXoa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(btnRefesh))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMaLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnRefesh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        tbLoai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã loại", "Tên loại"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbLoai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbLoaiMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(tbLoai);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMonActionPerformed
        String mamon = txtMaMon.getText().toUpperCase();
        String tenmon = txtTenMon.getText();
        MyCombobox myCBB = (MyCombobox)cbbTenLoai.getSelectedItem();
        String maloai = myCBB.MaString();
        String dv = cbbDV.getSelectedItem().toString();
        double giaban = Double.parseDouble(txtGiaBan.getText());

        if(txtMaMon.getText().equals("") && txtTenMon.getText().equals("")){
            ThongBao.ThongBaoCoIcon("Thông báo", "Nhập đầy đủ thông tin", 2);
        }else if(mamon.equals("")){
            ThongBao.ThongBaoCoIcon("Thông báo", "Mã món không bỏ trống", 2);
        }else if(tenmon.equals("")){
            ThongBao.ThongBaoCoIcon("Thông báo", "Tên món không bỏ trống", 2);
        }else if(txtGiaBan.getText().equals("0")){
            ThongBao.ThongBaoCoIcon("Thông báo", "Giá bán không hợp lệ", 2);
        }else{
            if (JOptionPane.showConfirmDialog(null, "Bạn muốn thêm " + tenmon.toUpperCase() + " ?", "Thông báo", JOptionPane.YES_NO_OPTION, 1) == JOptionPane.YES_OPTION) {
                ThucDon td = new ThucDon(mamon, tenmon, maloai, dv, giaban);
                ThongBao.ThongBaoDonGian("Thông báo", "Thêm thành công");
                BLL.BLLThucDon.Add(td);

                loadThucDon();
            }
        }

    }//GEN-LAST:event_btnThemMonActionPerformed

    private void btnXoaMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaMonActionPerformed
        int rowLoai = tbThucDon.getSelectedRow();
        if(rowLoai < 0 ){
            ThongBao.ThongBaoCoIcon("Thông báo", "Bạn chưa chọn dòng cần xóa", 2);
            return;
        }

        if (JOptionPane.showConfirmDialog(null, "Bạn muốn xóa " + txtTenMon.getText().toUpperCase() + " ?", "Thông báo", JOptionPane.YES_NO_OPTION, 1) == JOptionPane.YES_OPTION) {
            BLL.BLLThucDon.Delete(txtMaMon.getText());
            ThongBao.ThongBaoDonGian("Thông báo", "Xóa thành công");
            loadThucDon();
        }
    }//GEN-LAST:event_btnXoaMonActionPerformed

    private void btnSuaMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaMonActionPerformed
        int rowLoai = tbThucDon.getSelectedRow();
        
        String MaMon = txtMaMon.getText();
        String TenMon = txtTenMon.getText();
        MyCombobox myCBB = (MyCombobox)cbbTenLoai.getSelectedItem();
        String MaLoai = myCBB.MaString();
        String DV = cbbDV.getSelectedItem().toString();
        
        double GiaBan = Double.parseDouble(txtGiaBan.getText());
        if(rowLoai < 0 ){
            ThongBao.ThongBaoCoIcon("Thông báo", "Bạn chưa chọn dòng cần sửa", 2);
            return;
        }
        
        if (JOptionPane.showConfirmDialog(null, "Bạn muốn sửa " + txtTenMon.getText().toUpperCase() + " ?", "Thông báo", JOptionPane.YES_NO_OPTION, 1) == JOptionPane.YES_OPTION) {
            ThucDon td = new ThucDon(MaMon, TenMon, MaLoai, DV, GiaBan);
            
            BLL.BLLThucDon.Update(td);
            ThongBao.ThongBaoDonGian("Thông báo", "Sửa thành công");
            loadThucDon();
        }
    }//GEN-LAST:event_btnSuaMonActionPerformed

    private void btnRefeshMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefeshMonActionPerformed
        txtMaMon.setText("");
        txtMaMon.setEditable(true);
        txtTenMon.setText("");
        txtGiaBan.setText("0");
        btnThemMon.setEnabled(true);

    }//GEN-LAST:event_btnRefeshMonActionPerformed

    private void tbThucDonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbThucDonMousePressed
        int dongDangChon = tbThucDon.getSelectedRow();
        txtMaMon.setText(tbThucDon.getValueAt(dongDangChon, 0).toString());
        txtTenMon.setText(tbThucDon.getValueAt(dongDangChon, 1).toString());
        String TenLoai = tbThucDon.getValueAt(dongDangChon, 2).toString();
        BLL.BLLThucDon.HienThiLoaiMon(cbbTenLoai, TenLoai);
        cbbDV.setSelectedItem(tbThucDon.getValueAt(dongDangChon, 3).toString());
        txtGiaBan.setText(tbThucDon.getValueAt(dongDangChon, 4).toString());
        txtMaMon.setEditable(false);
        btnThemMon.setEnabled(false);
    }//GEN-LAST:event_tbThucDonMousePressed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        String MaLoai = txtMaLoai.getText().toUpperCase();
        String TenLoai = txtTenLoai.getText();
        if(MaLoai.equals("") && TenLoai.equals("")){
            ThongBao.ThongBaoCoIcon("Thông báo", "Nhập đầy đủ thông tin", 2);
            return;
        }
        if(MaLoai.equals("")){
            ThongBao.ThongBaoCoIcon("Thông báo", "Mã loại không bỏ trống", 2);
            return;
        }

        if(TenLoai.equals("")){
            ThongBao.ThongBaoCoIcon("Thông báo", "Tên loại không bỏ trống", 2);
            return;
        }

        if (JOptionPane.showConfirmDialog(null, "Bạn muốn thêm loại " + TenLoai.toUpperCase() + " ?", "Thông báo", JOptionPane.YES_NO_OPTION, 1) == JOptionPane.YES_OPTION) {
            LoaiMon lh = new LoaiMon(MaLoai, TenLoai);
            ThongBao.ThongBaoDonGian("Thông báo", "Thêm thành công");
            BLL.BLLLoaiMon.Add(lh);
        }
        loadLoaiMon();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int rowLoai = tbLoai.getSelectedRow();
        if(rowLoai < 0 ){
            ThongBao.ThongBaoCoIcon("Thông báo", "Bạn chưa chọn dòng cần xóa", 2);
            return;
        }

        if (JOptionPane.showConfirmDialog(null, "Bạn muốn xóa loại " + txtTenLoai.getText().toUpperCase() + " ?", "Thông báo", JOptionPane.YES_NO_OPTION, 1) == JOptionPane.YES_OPTION) {
            BLL.BLLLoaiMon.Delete(txtMaLoai.getText());
            ThongBao.ThongBaoDonGian("Thông báo", "Xóa thành công");
            loadLoaiMon();
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        int rowLoai = tbLoai.getSelectedRow();
        if(rowLoai < 0 ){
            ThongBao.ThongBaoCoIcon("Thông báo", "Bạn chưa chọn dòng cần sửa", 2);
            return;
        }

        if (JOptionPane.showConfirmDialog(null, "Bạn muốn thêm loại " + txtTenLoai.getText().toUpperCase() + " ?", "Thông báo", JOptionPane.YES_NO_OPTION, 1) == JOptionPane.YES_OPTION) {
            LoaiMon lh = new LoaiMon(txtTenLoai.getText());
            ThongBao.ThongBaoDonGian("Thông báo", "Sửa thành công");
            BLL.BLLLoaiMon.update(lh);

            loadLoaiMon();
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnRefeshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefeshActionPerformed
        txtMaLoai.setText("");
        txtMaLoai.setEditable(true);
        txtTenLoai.setText("");
        btnThem.setEnabled(true);
    }//GEN-LAST:event_btnRefeshActionPerformed

    private void tbLoaiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbLoaiMousePressed
        int dongDangChon = tbLoai.getSelectedRow();
        txtMaLoai.setText(tbLoai.getValueAt(dongDangChon, 0).toString());
        txtTenLoai.setText(tbLoai.getValueAt(dongDangChon, 1).toString());
        btnThem.setEnabled(false);
        txtMaLoai.setEditable(false);
    }//GEN-LAST:event_tbLoaiMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jdlThucDonMon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jdlThucDonMon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jdlThucDonMon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jdlThucDonMon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jdlThucDonMon dialog = new jdlThucDonMon(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefesh;
    private javax.swing.JButton btnRefeshMon;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnSuaMon;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThemMon;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXoaMon;
    private javax.swing.JComboBox<String> cbbDV;
    private javax.swing.JComboBox<String> cbbTenLoai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tbLoai;
    private javax.swing.JTable tbThucDon;
    private javax.swing.JTextField txtGiaBan;
    private javax.swing.JTextField txtMaLoai;
    private javax.swing.JTextField txtMaMon;
    private javax.swing.JTextField txtTenLoai;
    private javax.swing.JTextField txtTenMon;
    // End of variables declaration//GEN-END:variables
}
