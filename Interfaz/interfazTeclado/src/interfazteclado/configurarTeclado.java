

/**
 *
 * @author gabrielcarrillolopez
 */
package interfazteclado;

import javax.swing.ComboBoxModel;

public class configurarTeclado extends javax.swing.JFrame {
	//controladorTeclado conTeclado = new controladorTeclado();
	teclado tec = new teclado();
	Initialize init = new Initialize();
	
	/**
	 * Creates new form configurarTeclado
	 */
	
	public configurarTeclado() {
		initComponents();
		limpiarCampos();
	}
	
	public configurarTeclado(Initialize init, teclado tec) {
        this.tec = tec;
		this.init = init;
		initComponents();
		limpiarCampos();
		if (tec.getNumeroPosiciones() != 0)inicializarCampos();
	}
	
	
	public void inicializarCampos() {
		this.jtColumnas.setText(String.valueOf(tec.getNumeroColumnas()));
		this.jtFilas.setText(String.valueOf(tec.getNumeroFilas()));
		this.jtPosiciones.setText(String.valueOf(tec.getNumeroPosiciones()));
		
		ComboBoxModel cbm = this.cbFormaTeclado.getModel();
		for (int i = 0; i < cbm.getSize(); ++i) {
			if (cbm.getElementAt(i).toString().equals(tec.getForma())) {
				this.cbFormaTeclado.setSelectedItem(i);
				return;
			}
		}
		ComboBoxModel cbmod = this.cbLadosTeclas.getModel();
		int pos = 0;
		if (tec.getTeclasDe4Lados()) pos = 1;
		for (int i = 0; i < cbmod.getSize(); ++i) {
			if (cbmod.getElementAt(i).equals(pos)) {
				this.cbLadosTeclas.setSelectedItem(i);
				return;
			}
		}
		this.lbMens.setText("Valores anteriores");
	}


	
	public void limpiarCampos() {
		this.jtColumnas.setText("");
		this.jtFilas.setText("");
		this.jtPosiciones.setText("");
		this.lbMens.setText("");
		this.cbFormaTeclado.setSelectedIndex(0);
		this.cbLadosTeclas.setSelectedIndex(0);
		//this.lbMens.setVisible(false);
	}
        
     
	
	
	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        btAtras = new javax.swing.JButton();
        btGuardar = new javax.swing.JButton();
        lbMens = new javax.swing.JLabel();
        lbFilas = new javax.swing.JLabel();
        lbColumnas = new javax.swing.JLabel();
        lbPosiciones = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbFormaTeclado = new javax.swing.JLabel();
        jtFilas = new javax.swing.JTextField();
        jtColumnas = new javax.swing.JTextField();
        jtPosiciones = new javax.swing.JTextField();
        btResetValores = new javax.swing.JButton();
        cbLadosTeclas = new javax.swing.JComboBox();
        cbFormaTeclado = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 51));

        lbTitulo.setText("Editar teclado:");

        btAtras.setText("Atrás");
        btAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtrasActionPerformed(evt);
            }
        });

        btGuardar.setText("Guardar");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        lbMens.setBackground(new java.awt.Color(255, 51, 51));
        lbMens.setText("jLabel1");
        lbMens.setBorder(new javax.swing.border.MatteBorder(null));
        lbMens.setOpaque(true);

        lbFilas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbFilas.setText("Filas:");

        lbColumnas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbColumnas.setText("Columnas:");

        lbPosiciones.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbPosiciones.setText("Posiciones:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Lados teclas:");

        lbFormaTeclado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbFormaTeclado.setText("Forma Teclado:");

        jtFilas.setText("jTextField1");

        jtColumnas.setText("jTextField1");

        jtPosiciones.setText("jTextField1");
        jtPosiciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPosicionesActionPerformed(evt);
            }
        });

        btResetValores.setText("Reset Valores");
        btResetValores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResetValoresActionPerformed(evt);
            }
        });

        cbLadosTeclas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Seleccione lados teclas--", "4 lados", "6 lados" }));

        cbFormaTeclado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Seleccione forma teclado--", "Rectangular", "Hexagonal" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lbTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbFormaTeclado)
                            .addComponent(lbPosiciones, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lbFilas, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(4, 4, 4)))
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtColumnas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtFilas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtPosiciones, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbFormaTeclado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbLadosTeclas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btResetValores, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbMens, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btAtras)
                        .addGap(18, 18, 18)
                        .addComponent(btGuardar)))
                .addGap(81, 81, 81))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFilas)
                    .addComponent(jtFilas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbColumnas)
                    .addComponent(jtColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPosiciones)
                    .addComponent(jtPosiciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbLadosTeclas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFormaTeclado)
                    .addComponent(cbFormaTeclado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btResetValores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbMens)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAtras)
                    .addComponent(btGuardar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtPosicionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPosicionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPosicionesActionPerformed

    private void btResetValoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResetValoresActionPerformed
        limpiarCampos();
		
    }//GEN-LAST:event_btResetValoresActionPerformed

	void mostrarMensaje(String mens) {
		this.lbMens.setText(mens);
	}
	
    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        try {
			int columnas = Integer.parseInt(this.jtColumnas.getText());
			int filas = Integer.parseInt(this.jtFilas.getText());
			int posiciones = Integer.parseInt(this.jtPosiciones.getText());
			String forma = (String)cbFormaTeclado.getSelectedItem();
			boolean lados = false;
			if (cbLadosTeclas.getSelectedIndex() == 1) lados = true;
			if (cbLadosTeclas.getSelectedIndex() == 2) lados = false;
			
			boolean errorCampoVacio = false;
			if ("".equals(columnas))	errorCampoVacio = true;
			if ("".equals(filas))		errorCampoVacio = true;
			if ("".equals(posiciones))	errorCampoVacio = true;
			if (cbLadosTeclas.getSelectedIndex() == 0)	errorCampoVacio = true;
			if (cbFormaTeclado.getSelectedIndex() == 0)	errorCampoVacio = true;
			
			if (errorCampoVacio) {
				mostrarMensaje("Debe escoger todos los campos");
			}
			tec = new teclado(forma, filas, columnas, posiciones, lados);
			limpiarCampos();
			
            init.recibirTeclado(tec);
			init.recibirMsg("Teclado guardado");
			mostrarMensaje("Teclado guardado");
			
			configurarTeclado.this.setVisible(false);
			this.dispose();
			init.setVisible(true);
			
		} catch (Exception e) {
			mostrarMensaje("Error de guardado");
		}
    }//GEN-LAST:event_btGuardarActionPerformed

    private void btAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtrasActionPerformed
		configurarTeclado.this.setVisible(false);
		init.inicializarCampos();
		this.dispose();
		init.setVisible(true);
    }//GEN-LAST:event_btAtrasActionPerformed

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
			java.util.logging.Logger.getLogger(configurarTeclado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(configurarTeclado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(configurarTeclado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(configurarTeclado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
        //</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new configurarTeclado().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtras;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btResetValores;
    private javax.swing.JComboBox cbFormaTeclado;
    private javax.swing.JComboBox cbLadosTeclas;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jtColumnas;
    private javax.swing.JTextField jtFilas;
    private javax.swing.JTextField jtPosiciones;
    private javax.swing.JLabel lbColumnas;
    private javax.swing.JLabel lbFilas;
    private javax.swing.JLabel lbFormaTeclado;
    private javax.swing.JLabel lbMens;
    private javax.swing.JLabel lbPosiciones;
    private javax.swing.JLabel lbTitulo;
    // End of variables declaration//GEN-END:variables
}
