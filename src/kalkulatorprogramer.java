/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WINDOWS 10
 */
public class kalkulatorprogramer extends javax.swing.JFrame {
 String angka;
 double jumlah, bil1, bil2;
 int pilih;
 
    public kalkulatorprogramer() {
        initComponents();
        angka="";
    }
void angka1(){
    angka += "1";
    bil.setText(angka);
}
void angka2(){
    angka += "2";
    bil.setText(angka);
}
void angka3(){
    angka += "3";
    bil.setText(angka);
}
void angka4(){
    angka += "4";
    bil.setText(angka);
}
void angka5(){
    angka += "5";
    bil.setText(angka);
}void angka6(){
    angka += "6";
    bil.setText(angka);
}void angka7(){
    angka += "7";
    bil.setText(angka);
}void angka8(){
    angka += "8";
    bil.setText(angka);
}void angka9(){
    angka += "9";
    bil.setText(angka);
}void angka0(){
    angka += "0";
    bil.setText(angka);
}
void hasil(){
    switch(pilih){
        case 1:
            bil2=Double.parseDouble(angka);
            jumlah = bil1+bil2;
            angka=Double.toString(jumlah);
            bil.setText(angka);
            break;
        case 2:
            bil2=Double.parseDouble(angka);
            jumlah = bil1-bil2;
            angka=Double.toString(jumlah);
            bil.setText(angka);
            break;
            case 3:
            bil2=Double.parseDouble(angka);
            jumlah = bil1/bil2;
            angka=Double.toString(jumlah);
            bil.setText(angka);
            break;
            case 4:
            bil2=Double.parseDouble(angka);
            jumlah = bil1*bil2;
            angka=Double.toString(jumlah);
            bil.setText(angka);
            break;
            case 6:
            jumlah = Math.sqrt(bil1);
            angka=Double.toString(jumlah);
            bil.setText(angka);
            break;
            case 8:
            jumlah = bil1* 3.14;
            angka=Double.toString(jumlah);
            bil.setText(angka);
            break;
            case 9:
            jumlah = bil1*bil1;
            angka=Double.toString(jumlah);
            bil.setText(angka);
            break;
            case 10:
            jumlah = Math.sin(bil1);
            angka=Double.toString(jumlah);
            bil.setText(angka);
            break;
            case 11:
            jumlah = Math.cos(bil1);
            angka=Double.toString(jumlah);
            bil.setText(angka);
            break;
            case 12:
            jumlah = Math.tan(bil1);
            angka=Double.toString(jumlah);
            bil.setText(angka);
            break;
            case 13:
            jumlah = Math.log(bil1);
            angka=Double.toString(jumlah);
            bil.setText(angka);
            break;
            case 15:
            jumlah = bil1/100;
            angka=Double.toString(jumlah);
            bil.setText(angka);
            break;
    }
}
void tmbh(){
    bil1=Double.parseDouble(angka);
    bil.setText("+");
    angka="";
    pilih=1;
}
void krg(){
    bil1=Double.parseDouble(angka);
    bil.setText("-");
    angka="";
    pilih=2;
}
void bg(){
    bil1=Double.parseDouble(angka);
    bil.setText("/");
    angka="";
    pilih=3;
}
void kli(){
    bil1=Double.parseDouble(angka);
    bil.setText("*");
    angka="";
    pilih=4;
}
void koma(){
    angka += ".";
    bil.setText(angka);
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
        jLabel1 = new javax.swing.JLabel();
        bil = new javax.swing.JTextField();
        tmbh = new javax.swing.JButton();
        krg = new javax.swing.JButton();
        bg = new javax.swing.JButton();
        kli = new javax.swing.JButton();
        satu = new javax.swing.JButton();
        dua = new javax.swing.JButton();
        tiga = new javax.swing.JButton();
        empat = new javax.swing.JButton();
        lima = new javax.swing.JButton();
        enam = new javax.swing.JButton();
        tujuh = new javax.swing.JButton();
        dlpn = new javax.swing.JButton();
        smbln = new javax.swing.JButton();
        nol = new javax.swing.JButton();
        smdg = new javax.swing.JButton();
        sin = new javax.swing.JButton();
        cos = new javax.swing.JButton();
        log = new javax.swing.JButton();
        tan = new javax.swing.JButton();
        akar = new javax.swing.JButton();
        del = new javax.swing.JButton();
        phi = new javax.swing.JButton();
        pangkat = new javax.swing.JButton();
        persen = new javax.swing.JButton();
        koma = new javax.swing.JButton();
        hapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KALKULATOR ");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 255, 102));

        jLabel1.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("KALKULATOR SCIENTIFIC ");

        bil.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bil.setText(" ");
        bil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bilActionPerformed(evt);
            }
        });

        tmbh.setBackground(new java.awt.Color(102, 255, 255));
        tmbh.setText("+");
        tmbh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbhActionPerformed(evt);
            }
        });

        krg.setBackground(new java.awt.Color(102, 255, 255));
        krg.setText("-");
        krg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                krgActionPerformed(evt);
            }
        });

        bg.setBackground(new java.awt.Color(102, 255, 255));
        bg.setText("/");
        bg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bgActionPerformed(evt);
            }
        });

        kli.setBackground(new java.awt.Color(102, 255, 255));
        kli.setText("x");
        kli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kliActionPerformed(evt);
            }
        });

        satu.setBackground(new java.awt.Color(255, 204, 204));
        satu.setText("1");
        satu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                satuActionPerformed(evt);
            }
        });

        dua.setBackground(new java.awt.Color(255, 204, 204));
        dua.setText("2");
        dua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duaActionPerformed(evt);
            }
        });

        tiga.setBackground(new java.awt.Color(255, 204, 204));
        tiga.setText("3");
        tiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tigaActionPerformed(evt);
            }
        });

        empat.setBackground(new java.awt.Color(255, 204, 204));
        empat.setText("4");
        empat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empatActionPerformed(evt);
            }
        });

        lima.setBackground(new java.awt.Color(255, 204, 204));
        lima.setText("5");
        lima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limaActionPerformed(evt);
            }
        });

        enam.setBackground(new java.awt.Color(255, 204, 204));
        enam.setText("6");
        enam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enamActionPerformed(evt);
            }
        });

        tujuh.setBackground(new java.awt.Color(255, 204, 204));
        tujuh.setText("7");
        tujuh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tujuhActionPerformed(evt);
            }
        });

        dlpn.setBackground(new java.awt.Color(255, 204, 204));
        dlpn.setText("8");
        dlpn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlpnActionPerformed(evt);
            }
        });

        smbln.setBackground(new java.awt.Color(255, 204, 204));
        smbln.setText("9");
        smbln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smblnActionPerformed(evt);
            }
        });

        nol.setBackground(new java.awt.Color(255, 204, 204));
        nol.setText("0");
        nol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nolActionPerformed(evt);
            }
        });

        smdg.setBackground(new java.awt.Color(255, 255, 0));
        smdg.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        smdg.setText("=");
        smdg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smdgActionPerformed(evt);
            }
        });

        sin.setBackground(new java.awt.Color(204, 204, 204));
        sin.setText("sin");
        sin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinActionPerformed(evt);
            }
        });

        cos.setBackground(new java.awt.Color(204, 204, 204));
        cos.setText("cos");
        cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosActionPerformed(evt);
            }
        });

        log.setBackground(new java.awt.Color(204, 204, 204));
        log.setText("log");
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });

        tan.setBackground(new java.awt.Color(204, 204, 204));
        tan.setText("tan");
        tan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanActionPerformed(evt);
            }
        });

        akar.setBackground(new java.awt.Color(204, 204, 204));
        akar.setText("√");
        akar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akarActionPerformed(evt);
            }
        });

        del.setBackground(new java.awt.Color(255, 255, 51));
        del.setText("Delete");
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });

        phi.setBackground(new java.awt.Color(204, 204, 204));
        phi.setText("π");
        phi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phiActionPerformed(evt);
            }
        });

        pangkat.setBackground(new java.awt.Color(204, 204, 204));
        pangkat.setText("x^2");
        pangkat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pangkatActionPerformed(evt);
            }
        });

        persen.setBackground(new java.awt.Color(204, 204, 204));
        persen.setText("%");
        persen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                persenActionPerformed(evt);
            }
        });

        koma.setText(".");
        koma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                komaActionPerformed(evt);
            }
        });

        hapus.setBackground(new java.awt.Color(255, 0, 0));
        hapus.setText("c");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(krg, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kli, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(empat, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lima))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(tujuh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(dlpn)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(hapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(smbln, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(koma)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(smdg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nol, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(del, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tan)
                                .addGap(11, 11, 11)
                                .addComponent(log))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(phi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(akar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pangkat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(persen, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(enam, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tmbh, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(satu, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dua, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tiga, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(sin, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cos))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bil, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bil, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tiga, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(satu, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(dua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tmbh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(enam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(krg, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                            .addComponent(empat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(log, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tujuh, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dlpn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(smbln, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phi, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(akar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(kli, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nol, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pangkat, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(persen, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(koma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(del, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(smdg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 420, 400);

        setSize(new java.awt.Dimension(428, 414));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bilActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_bilActionPerformed

    private void satuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_satuActionPerformed
        // TODO add your handling code here:
        
        angka1();
    }//GEN-LAST:event_satuActionPerformed

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
        // TODO add your handling code here:
        bil.setText("");
        bil1=(int) 0.0;
        bil2=(int) 0.0;
        jumlah=(int) 0.0;
        angka="";
    }//GEN-LAST:event_delActionPerformed

    private void duaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duaActionPerformed
        // TODO add your handling code here:
        angka2();
    }//GEN-LAST:event_duaActionPerformed

    private void tigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tigaActionPerformed
        // TODO add your handling code here:
        angka3();
    }//GEN-LAST:event_tigaActionPerformed

    private void empatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empatActionPerformed
        // TODO add your handling code here:
        angka4();
    }//GEN-LAST:event_empatActionPerformed

    private void limaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limaActionPerformed
        // TODO add your handling code here:
        angka5();
    }//GEN-LAST:event_limaActionPerformed

    private void enamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enamActionPerformed
        // TODO add your handling code here:
        angka6();
    }//GEN-LAST:event_enamActionPerformed

    private void tujuhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tujuhActionPerformed
        // TODO add your handling code here:
        angka7();
    }//GEN-LAST:event_tujuhActionPerformed

    private void dlpnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlpnActionPerformed
        // TODO add your handling code here:
        angka8();
    }//GEN-LAST:event_dlpnActionPerformed

    private void smblnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smblnActionPerformed
        // TODO add your handling code here:
        angka9();
    }//GEN-LAST:event_smblnActionPerformed

    private void nolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nolActionPerformed
        // TODO add your handling code here:
        angka0();
    }//GEN-LAST:event_nolActionPerformed

    private void tmbhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbhActionPerformed
        // TODO add your handling code here:
       tmbh();
    }//GEN-LAST:event_tmbhActionPerformed

    private void krgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_krgActionPerformed
        // TODO add your handling code here:
krg();
    }//GEN-LAST:event_krgActionPerformed

    private void bgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bgActionPerformed
        // TODO add your handling code here:
bg();


    }//GEN-LAST:event_bgActionPerformed

    private void kliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kliActionPerformed
        // TODO add your handling code here:
        kli();
    }//GEN-LAST:event_kliActionPerformed

    private void smdgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smdgActionPerformed
        // TODO add your handling code here:
        hasil();
    }//GEN-LAST:event_smdgActionPerformed

    private void sinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinActionPerformed
        // TODO add your handling code here:
        bil1=Double.parseDouble(angka);
        bil.setText(" Sin ");
        angka="";
        pilih=10;
    }//GEN-LAST:event_sinActionPerformed

    private void cosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosActionPerformed
        // TODO add your handling code here:
        bil1=Double.parseDouble(angka);
        bil.setText(" Cos ");
        angka="";
        pilih=11;
    }//GEN-LAST:event_cosActionPerformed

    private void tanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanActionPerformed
        // TODO add your handling code here:
        bil1=Double.parseDouble(angka);
        bil.setText(" Tan ");
        angka="";
        pilih=12;
    }//GEN-LAST:event_tanActionPerformed

    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed
        // TODO add your handling code here:
        bil1=Double.parseDouble(angka);
        bil.setText(" Log ");
        angka="";
        pilih=13;
    }//GEN-LAST:event_logActionPerformed

    private void akarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akarActionPerformed
        // TODO add your handling code here:
        bil1=Double.parseDouble(angka);
        bil.setText(" √ ");
        angka="";
        pilih=6;
    }//GEN-LAST:event_akarActionPerformed

    private void phiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phiActionPerformed
        // TODO add your handling code here:
        bil1=Double.parseDouble(angka);
        bil.setText(" π ");
        angka="";
        pilih=8;
    }//GEN-LAST:event_phiActionPerformed

    private void pangkatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pangkatActionPerformed
        // TODO add your handling code here:
        bil1=Double.parseDouble(angka);
        bil.setText(" x^2 ");
        angka="";
        pilih=9;
    }//GEN-LAST:event_pangkatActionPerformed

    private void persenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_persenActionPerformed
        // TODO add your handling code here:
        bil1=Double.parseDouble(angka);
        bil.setText(" % ");
        angka="";
        pilih=15;
    }//GEN-LAST:event_persenActionPerformed

    private void komaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_komaActionPerformed
        // TODO add your handling code here:
        koma();
    }//GEN-LAST:event_komaActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
        bil.getText().length();
StringBuilder all = new StringBuilder (bil.getText());
char end = all.charAt(all.length()-1);
all.deleteCharAt(all.length()-1);
bil.setText(all.toString());
angka = bil.getText();
if (hapus.getText().length() > 0){
    del.setEnabled(true);
}
    }//GEN-LAST:event_hapusActionPerformed

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
            java.util.logging.Logger.getLogger(kalkulatorprogramer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kalkulatorprogramer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kalkulatorprogramer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kalkulatorprogramer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kalkulatorprogramer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton akar;
    private javax.swing.JButton bg;
    private javax.swing.JTextField bil;
    private javax.swing.JButton cos;
    private javax.swing.JButton del;
    private javax.swing.JButton dlpn;
    private javax.swing.JButton dua;
    private javax.swing.JButton empat;
    private javax.swing.JButton enam;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton kli;
    private javax.swing.JButton koma;
    private javax.swing.JButton krg;
    private javax.swing.JButton lima;
    private javax.swing.JButton log;
    private javax.swing.JButton nol;
    private javax.swing.JButton pangkat;
    private javax.swing.JButton persen;
    private javax.swing.JButton phi;
    private javax.swing.JButton satu;
    private javax.swing.JButton sin;
    private javax.swing.JButton smbln;
    private javax.swing.JButton smdg;
    private javax.swing.JButton tan;
    private javax.swing.JButton tiga;
    private javax.swing.JButton tmbh;
    private javax.swing.JButton tujuh;
    // End of variables declaration//GEN-END:variables
}
