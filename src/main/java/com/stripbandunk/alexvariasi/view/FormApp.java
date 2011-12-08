/*
 *  Copyright (c) 2011, StripBandunk and/or its affiliates. All rights reserved.
 * 
 *       http://stripbandunk.com/
 * 
 *  STRIPBANDUNK PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

/*
 * Form.java
 *
 * Created on Nov 21, 2011, 10:52:35 PM
 */
package com.stripbandunk.alexvariasi.view;

import com.stripbandunk.alexvariasi.view.impl.*;

/**
 *
 * @author Eko Kurniawan Khannedy
 */
public class FormApp extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    /**
     * Creates new form Form
     */
    public FormApp() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBarApp = new javax.swing.JMenuBar();
        jMenuAplikasi = new javax.swing.JMenu();
        jMenuItemBeranda = new javax.swing.JMenuItem();
        jMenuItemKeluarAplikasi = new javax.swing.JMenuItem();
        jMenuItemTutupAplikasi = new javax.swing.JMenuItem();
        jMenuDataMaster = new javax.swing.JMenu();
        jMenuItemKategori = new javax.swing.JMenuItem();
        jMenuItemSatuan = new javax.swing.JMenuItem();
        jMenuItemBarang = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemPemasok = new javax.swing.JMenuItem();
        jMenuItemPelanggan = new javax.swing.JMenuItem();
        jMenuItemPenjual = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItemJabatan = new javax.swing.JMenuItem();
        jMenuItemKaryawan = new javax.swing.JMenuItem();
        jMenuTransaksi = new javax.swing.JMenu();
        jMenuItemPenjualan = new javax.swing.JMenuItem();
        jMenuItemPembelian = new javax.swing.JMenuItem();
        jMenuHakAkses = new javax.swing.JMenu();
        jMenuItemGrup = new javax.swing.JMenuItem();
        jMenuItemPengguna = new javax.swing.JMenuItem();
        jMenuLaporan = new javax.swing.JMenu();
        jMenuItemPemasukan = new javax.swing.JMenuItem();
        jMenuItemPengeluaran = new javax.swing.JMenuItem();
        jMenuItemKeuntungan = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alex-Variasi");
        getContentPane().setLayout(new java.awt.CardLayout());

        jMenuBarApp.setName("jMenuBarApp"); // NOI18N

        jMenuAplikasi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stripbandunk/alexvariasi/image/aplikasi.png"))); // NOI18N
        jMenuAplikasi.setText("Aplikasi");
        jMenuAplikasi.setName("jMenuAplikasi"); // NOI18N

        jMenuItemBeranda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemBeranda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stripbandunk/alexvariasi/image/beranda.png"))); // NOI18N
        jMenuItemBeranda.setText("Beranda");
        jMenuItemBeranda.setName("jMenuItemBeranda"); // NOI18N
        jMenuItemBeranda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionMenuItem(evt);
            }
        });
        jMenuAplikasi.add(jMenuItemBeranda);

        jMenuItemKeluarAplikasi.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemKeluarAplikasi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stripbandunk/alexvariasi/image/keluar.png"))); // NOI18N
        jMenuItemKeluarAplikasi.setText("Keluar Pengguna");
        jMenuItemKeluarAplikasi.setName("jMenuItemKeluarAplikasi"); // NOI18N
        jMenuItemKeluarAplikasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionMenuItem(evt);
            }
        });
        jMenuAplikasi.add(jMenuItemKeluarAplikasi);

        jMenuItemTutupAplikasi.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemTutupAplikasi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stripbandunk/alexvariasi/image/tutup.png"))); // NOI18N
        jMenuItemTutupAplikasi.setText("Tutup Aplikasi");
        jMenuItemTutupAplikasi.setName("jMenuItemTutupAplikasi"); // NOI18N
        jMenuItemTutupAplikasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionMenuItem(evt);
            }
        });
        jMenuAplikasi.add(jMenuItemTutupAplikasi);

        jMenuBarApp.add(jMenuAplikasi);

        jMenuDataMaster.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stripbandunk/alexvariasi/image/master-data.png"))); // NOI18N
        jMenuDataMaster.setText("Data Master");
        jMenuDataMaster.setName("jMenuDataMaster"); // NOI18N

        jMenuItemKategori.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemKategori.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stripbandunk/alexvariasi/image/kategori.png"))); // NOI18N
        jMenuItemKategori.setText("Kategori");
        jMenuItemKategori.setName("jMenuItemKategori"); // NOI18N
        jMenuItemKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionMenuItem(evt);
            }
        });
        jMenuDataMaster.add(jMenuItemKategori);

        jMenuItemSatuan.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemSatuan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stripbandunk/alexvariasi/image/satuan.png"))); // NOI18N
        jMenuItemSatuan.setText("Satuan");
        jMenuItemSatuan.setName("jMenuItemSatuan"); // NOI18N
        jMenuItemSatuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionMenuItem(evt);
            }
        });
        jMenuDataMaster.add(jMenuItemSatuan);

        jMenuItemBarang.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemBarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stripbandunk/alexvariasi/image/barang.png"))); // NOI18N
        jMenuItemBarang.setText("Barang");
        jMenuItemBarang.setName("jMenuItemBarang"); // NOI18N
        jMenuItemBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionMenuItem(evt);
            }
        });
        jMenuDataMaster.add(jMenuItemBarang);

        jSeparator1.setName("jSeparator1"); // NOI18N
        jMenuDataMaster.add(jSeparator1);

        jMenuItemPemasok.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemPemasok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stripbandunk/alexvariasi/image/pemasok.png"))); // NOI18N
        jMenuItemPemasok.setText("Pemasok");
        jMenuItemPemasok.setName("jMenuItemPemasok"); // NOI18N
        jMenuItemPemasok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionMenuItem(evt);
            }
        });
        jMenuDataMaster.add(jMenuItemPemasok);

        jMenuItemPelanggan.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemPelanggan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stripbandunk/alexvariasi/image/pelanggan.png"))); // NOI18N
        jMenuItemPelanggan.setText("Pelanggan");
        jMenuItemPelanggan.setName("jMenuItemPelanggan"); // NOI18N
        jMenuItemPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionMenuItem(evt);
            }
        });
        jMenuDataMaster.add(jMenuItemPelanggan);

        jMenuItemPenjual.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemPenjual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stripbandunk/alexvariasi/image/penjual.png"))); // NOI18N
        jMenuItemPenjual.setText("Penjual");
        jMenuItemPenjual.setName("jMenuItemPenjual"); // NOI18N
        jMenuItemPenjual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionMenuItem(evt);
            }
        });
        jMenuDataMaster.add(jMenuItemPenjual);

        jSeparator2.setName("jSeparator2"); // NOI18N
        jMenuDataMaster.add(jSeparator2);

        jMenuItemJabatan.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemJabatan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stripbandunk/alexvariasi/image/jabatan.png"))); // NOI18N
        jMenuItemJabatan.setText("Jabatan");
        jMenuItemJabatan.setName("jMenuItemJabatan"); // NOI18N
        jMenuItemJabatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionMenuItem(evt);
            }
        });
        jMenuDataMaster.add(jMenuItemJabatan);

        jMenuItemKaryawan.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemKaryawan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stripbandunk/alexvariasi/image/karyawan.png"))); // NOI18N
        jMenuItemKaryawan.setText("Karyawan");
        jMenuItemKaryawan.setName("jMenuItemKaryawan"); // NOI18N
        jMenuItemKaryawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionMenuItem(evt);
            }
        });
        jMenuDataMaster.add(jMenuItemKaryawan);

        jMenuBarApp.add(jMenuDataMaster);

        jMenuTransaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stripbandunk/alexvariasi/image/transaksi.png"))); // NOI18N
        jMenuTransaksi.setText("Transaksi");
        jMenuTransaksi.setName("jMenuTransaksi"); // NOI18N

        jMenuItemPenjualan.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItemPenjualan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stripbandunk/alexvariasi/image/penjualan.png"))); // NOI18N
        jMenuItemPenjualan.setText("Penjualan");
        jMenuItemPenjualan.setName("jMenuItemPenjualan"); // NOI18N
        jMenuItemPenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionMenuItem(evt);
            }
        });
        jMenuTransaksi.add(jMenuItemPenjualan);

        jMenuItemPembelian.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItemPembelian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stripbandunk/alexvariasi/image/pembelian.png"))); // NOI18N
        jMenuItemPembelian.setText("Pembelian");
        jMenuItemPembelian.setName("jMenuItemPembelian"); // NOI18N
        jMenuItemPembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionMenuItem(evt);
            }
        });
        jMenuTransaksi.add(jMenuItemPembelian);

        jMenuBarApp.add(jMenuTransaksi);

        jMenuHakAkses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stripbandunk/alexvariasi/image/hak-akses.png"))); // NOI18N
        jMenuHakAkses.setText("Hak Akses");
        jMenuHakAkses.setName("jMenuHakAkses"); // NOI18N

        jMenuItemGrup.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemGrup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stripbandunk/alexvariasi/image/grup.png"))); // NOI18N
        jMenuItemGrup.setText("Grup");
        jMenuItemGrup.setName("jMenuItemGrup"); // NOI18N
        jMenuItemGrup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionMenuItem(evt);
            }
        });
        jMenuHakAkses.add(jMenuItemGrup);

        jMenuItemPengguna.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemPengguna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stripbandunk/alexvariasi/image/pengguna.png"))); // NOI18N
        jMenuItemPengguna.setText("Pengguna");
        jMenuItemPengguna.setName("jMenuItemPengguna"); // NOI18N
        jMenuItemPengguna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionMenuItem(evt);
            }
        });
        jMenuHakAkses.add(jMenuItemPengguna);

        jMenuBarApp.add(jMenuHakAkses);

        jMenuLaporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stripbandunk/alexvariasi/image/laporan.png"))); // NOI18N
        jMenuLaporan.setText("Laporan");
        jMenuLaporan.setName("jMenuLaporan"); // NOI18N

        jMenuItemPemasukan.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemPemasukan.setText("Pemasukan");
        jMenuItemPemasukan.setName("jMenuItemPemasukan"); // NOI18N
        jMenuLaporan.add(jMenuItemPemasukan);

        jMenuItemPengeluaran.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemPengeluaran.setText("Pengeluaran");
        jMenuItemPengeluaran.setName("jMenuItemPengeluaran"); // NOI18N
        jMenuLaporan.add(jMenuItemPengeluaran);

        jMenuItemKeuntungan.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemKeuntungan.setText("Keuntungan");
        jMenuItemKeuntungan.setName("jMenuItemKeuntungan"); // NOI18N
        jMenuLaporan.add(jMenuItemKeuntungan);

        jMenuBarApp.add(jMenuLaporan);

        setJMenuBar(jMenuBarApp);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-810)/2, (screenSize.height-630)/2, 810, 630);
    }// </editor-fold>//GEN-END:initComponents

    private void actionMenuItem(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionMenuItem
        Object source = evt.getSource();
        if (source == jMenuItemBarang) {
            showView(new DaftarBarangView(this));
        } else if (source == jMenuItemGrup) {
        } else if (source == jMenuItemJabatan) {
            showView(new DaftarJabatanView(this));
        } else if (source == jMenuItemKaryawan) {
            showView(new DaftarKaryawanView(this));
        } else if (source == jMenuItemKategori) {
            showView(new DaftarKategoriView(this));
        } else if (source == jMenuItemKeluarAplikasi) {
        } else if (source == jMenuItemKeuntungan) {
        } else if (source == jMenuItemPelanggan) {
        } else if (source == jMenuItemPemasok) {
            showView(new DaftarPemasokView(this));
        } else if (source == jMenuItemPemasukan) {
        } else if (source == jMenuItemPembelian) {
        } else if (source == jMenuItemPengeluaran) {
        } else if (source == jMenuItemPengguna) {
        } else if (source == jMenuItemPenjual) {
        } else if (source == jMenuItemPenjualan) {
        } else if (source == jMenuItemSatuan) {
            showView(new DaftarSatuanView(this));
        } else if (source == jMenuItemTutupAplikasi) {
            System.exit(0);
        } else if (source == jMenuItemBeranda) {
        }
    }//GEN-LAST:event_actionMenuItem
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenuAplikasi;
    private javax.swing.JMenuBar jMenuBarApp;
    private javax.swing.JMenu jMenuDataMaster;
    private javax.swing.JMenu jMenuHakAkses;
    private javax.swing.JMenuItem jMenuItemBarang;
    private javax.swing.JMenuItem jMenuItemBeranda;
    private javax.swing.JMenuItem jMenuItemGrup;
    private javax.swing.JMenuItem jMenuItemJabatan;
    private javax.swing.JMenuItem jMenuItemKaryawan;
    private javax.swing.JMenuItem jMenuItemKategori;
    private javax.swing.JMenuItem jMenuItemKeluarAplikasi;
    private javax.swing.JMenuItem jMenuItemKeuntungan;
    private javax.swing.JMenuItem jMenuItemPelanggan;
    private javax.swing.JMenuItem jMenuItemPemasok;
    private javax.swing.JMenuItem jMenuItemPemasukan;
    private javax.swing.JMenuItem jMenuItemPembelian;
    private javax.swing.JMenuItem jMenuItemPengeluaran;
    private javax.swing.JMenuItem jMenuItemPengguna;
    private javax.swing.JMenuItem jMenuItemPenjual;
    private javax.swing.JMenuItem jMenuItemPenjualan;
    private javax.swing.JMenuItem jMenuItemSatuan;
    private javax.swing.JMenuItem jMenuItemTutupAplikasi;
    private javax.swing.JMenu jMenuLaporan;
    private javax.swing.JMenu jMenuTransaksi;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    // End of variables declaration//GEN-END:variables

    public void showView(DialogView view) {
        showView(view, null);
    }

    public void showView(DialogView view, Object parameter) {
        view.display(this, parameter);
    }
}
