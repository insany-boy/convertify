/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.conversoraudio;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.List;
import javax.swing.filechooser.FileNameExtensionFilter;

public class conversor extends javax.swing.JFrame {

    /**
     * Creates new form conversor
     */
    public conversor() {
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

        jPanel1 = new javax.swing.JPanel();
        txtentrada = new javax.swing.JLabel();
        bttselecionar = new javax.swing.JButton();
        txtformatsaida = new javax.swing.JLabel();
        audios = new javax.swing.JComboBox<>();
        txtdiretorio = new javax.swing.JLabel();
        bttdiretorioselec = new javax.swing.JButton();
        txtConverter = new javax.swing.JLabel();
        bttconverter = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jProgressBar1 = new javax.swing.JProgressBar();
        txttitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(18, 18, 18));

        txtentrada.setBackground(new java.awt.Color(255, 235, 59));
        txtentrada.setForeground(new java.awt.Color(187, 134, 252));
        txtentrada.setText("Entrada");

        bttselecionar.setBackground(new java.awt.Color(98, 0, 238));
        bttselecionar.setForeground(new java.awt.Color(255, 255, 255));
        bttselecionar.setText("Selecionar");
        bttselecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttselecionarActionPerformed(evt);
            }
        });

        txtformatsaida.setBackground(new java.awt.Color(255, 235, 59));
        txtformatsaida.setForeground(new java.awt.Color(187, 134, 252));
        txtformatsaida.setText("Formato de Saída");

        audios.setBackground(new java.awt.Color(98, 0, 238));
        audios.setForeground(new java.awt.Color(255, 255, 255));
        audios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "mp3", "wav", "m4a", "ogg", "flac", " " }));
        audios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                audiosActionPerformed(evt);
            }
        });

        txtdiretorio.setForeground(new java.awt.Color(187, 134, 252));
        txtdiretorio.setText("Diretorio de Saída");

        bttdiretorioselec.setBackground(new java.awt.Color(98, 0, 238));
        bttdiretorioselec.setForeground(new java.awt.Color(255, 255, 255));
        bttdiretorioselec.setText("Selecionar");
        bttdiretorioselec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttdiretorioselecActionPerformed(evt);
            }
        });

        txtConverter.setForeground(new java.awt.Color(187, 134, 252));
        txtConverter.setText("Converter");

        bttconverter.setBackground(new java.awt.Color(98, 0, 238));
        bttconverter.setForeground(new java.awt.Color(255, 255, 255));
        bttconverter.setText("Converter");
        bttconverter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttconverterActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jProgressBar1.setBackground(new java.awt.Color(207, 102, 121));
        jProgressBar1.setForeground(new java.awt.Color(39, 174, 96));

        txttitulo.setBackground(new java.awt.Color(255, 255, 255));
        txttitulo.setFont(new java.awt.Font("Raleway ExtraLight", 0, 36)); // NOI18N
        txttitulo.setForeground(new java.awt.Color(187, 134, 252));
        txttitulo.setText("Convertify");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(txttitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtdiretorio, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(bttdiretorioselec, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtentrada, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(bttselecionar)))
                .addGap(142, 142, 142)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtformatsaida, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(audios, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtConverter, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(bttconverter, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(txttitulo)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txtentrada))
                    .addComponent(bttselecionar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(txtformatsaida))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(audios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bttdiretorioselec)
                    .addComponent(bttconverter)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdiretorio)
                            .addComponent(txtConverter))))
                .addGap(92, 92, 92)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    }// </editor-fold>//GEN-END:initComponents

    private int tempoTotal = 0; 
    
    private void bttselecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttselecionarActionPerformed
        // TODO add your handling code here:
        // Criar uma instância de JFileChooser
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Selecione o arquivo de entrada");

        // Definir filtros para tipos de arquivos de áudio
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivos de Áudio", "mp3", "wav", "m4a", "ogg", "flac");
        fileChooser.setFileFilter(filter);

        // Abrir o seletor de arquivos
        int returnValue = fileChooser.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            // Exibir o caminho do arquivo selecionado na interface
            jTextArea1.setText("Arquivo selecionado: " + selectedFile.getAbsolutePath());
        }
    }//GEN-LAST:event_bttselecionarActionPerformed

    private void audiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_audiosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_audiosActionPerformed

   private int parseTempoParaSegundos(String tempo) {
    String[] partes = tempo.split(":");
    int segundos = 0;
    
    if (partes.length == 3) {
        // HH:MM:SS
        int horas = Integer.parseInt(partes[0]);
        int minutos = Integer.parseInt(partes[1]);
        int s = Integer.parseInt(partes[2]);
        segundos = horas * 3600 + minutos * 60 + s;
    } else if (partes.length == 2) {
        // MM:SS
        int minutos = Integer.parseInt(partes[0]);
        int s = Integer.parseInt(partes[1]);
        segundos = minutos * 60 + s;
    }
    return segundos;
}

    
    private int obterTempoTotal(String caminhoEntrada) throws Exception {
    // Caminho do FFmpeg
    String ffmpegPath = "C:\\ffmpeg-master-latest-win64-gpl\\ffmpeg-master-latest-win64-gpl\\bin\\ffmpeg.exe";
    
    // Comando para obter a duração do arquivo (sem converter)
    String comando = ffmpegPath + " -i \"" + caminhoEntrada + "\"";
    
    // Executa o comando
    ProcessBuilder processBuilder = new ProcessBuilder(comando.split(" "));
    processBuilder.redirectErrorStream(true);
    Process process = processBuilder.start();
    
    // Lê a saída do FFmpeg para encontrar a duração
    BufferedReader reader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
    String line;
    
    while ((line = reader.readLine()) != null) {
        if (line.contains("Duration")) {
            // Extrai a duração da linha, no formato HH:MM:SS.xx
            String duracao = line.split("Duration:")[1].split(",")[0].trim();
            tempoTotal = parseTempoParaSegundos(duracao); // Aqui calculamos os segundos totais
            break;
        }
    }
    process.waitFor();
    return tempoTotal;
}




    private void bttconverterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttconverterActionPerformed
      String formatoSaida = (String) audios.getSelectedItem();
    String caminhoEntrada = jTextArea1.getText().replace("Arquivo selecionado: ", "").trim();
    String caminhoSaida = txtdiretorio.getText().replace("Diretório de saída: ", "").trim();

    if (caminhoEntrada.isEmpty() || caminhoSaida.isEmpty() || formatoSaida.isEmpty()) {
        jTextArea1.append("Preencha todos os campos antes de converter.\n");
        return;
    }

    // Inicia a barra de progresso em modo indeterminado
    jProgressBar1.setIndeterminate(true);
    jTextArea1.append("Arquivo selecionado: " + caminhoEntrada + "\n");  // Exibindo o caminho do arquivo
    jTextArea1.append("Iniciando a conversão...\n");

    // Usando SwingWorker para não bloquear a interface gráfica
    SwingWorker<Void, String> conversaoTask = new SwingWorker<Void, String>() { 
        @Override
        protected Void doInBackground() throws Exception {
            try {
                // Caminho do FFmpeg (substitua pelo caminho correto no seu sistema)
                String ffmpegPath = "C:\\ffmpeg-master-latest-win64-gpl\\ffmpeg-master-latest-win64-gpl\\bin\\ffmpeg.exe";

                // Extraindo o nome do arquivo original sem a extensão
                String nomeArquivoOriginal = new File(caminhoEntrada).getName();
                String nomeSemExtensao = nomeArquivoOriginal.substring(0, nomeArquivoOriginal.lastIndexOf('.'));

                // Obter tempo total antes de começar a conversão
                tempoTotal = obterTempoTotal(caminhoEntrada);  // Atualizando a variável tempoTotal aqui

                // Definindo o comando para conversão
                String comando = ffmpegPath + " -i \"" + caminhoEntrada + "\" \"" + caminhoSaida + "/" + nomeSemExtensao + "." + formatoSaida + "\" -hide_banner";

                // Executando o comando
                ProcessBuilder processBuilder = new ProcessBuilder(comando.split(" "));
                processBuilder.redirectErrorStream(true); // Combina a saída de erro e a saída padrão

                // Iniciando o processo
                Process process = processBuilder.start();

                // Capturando a saída do ffmpeg (fluxo de saída padrão)
                BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                String line;

                while ((line = reader.readLine()) != null) {
                    // Verificação se o FFmpeg relata erro
                    if (line.contains("Error") || line.contains("failed")) {
                        publish("Erro durante a conversão: " + line + "\n");
                    }

                    // Exemplo de como capturar o progresso baseado no tempo (caso o FFmpeg forneça essa informação)
                    if (line.startsWith("frame=")) {
                        String tempo = line.split("time=")[1].split(" ")[0];
                        int segundos = parseTempoParaSegundos(tempo); // Ajuste para calcular o progresso
                        int progresso = (segundos * 100) / tempoTotal; // tempoTotal agora é acessível aqui
                        jProgressBar1.setValue(progresso);
                    }
                }

                // Esperando o processo terminar
                int exitCode = process.waitFor();
                if (exitCode != 0) {
                    publish("Erro durante a conversão. Código de saída: " + exitCode + "\n");
                }

                // Caso a conversão tenha sido bem-sucedida
                publish("Conversão concluída!\n");
                publish("Arquivo salvo em: " + caminhoSaida + "/" + nomeSemExtensao + "." + formatoSaida + "\n");

            } catch (Exception e) {
                publish("Erro ao tentar converter o arquivo: " + e.getMessage() + "\n");
            }
            return null;
        }

        @Override
        protected void process(java.util.List<String> chunks) {
            // Atualizando a interface gráfica com a saída do processo
            for (String message : chunks) {
                jTextArea1.append(message);
            }
        }

        @Override
        protected void done() {
            // Finaliza a barra de progresso e torna ela não indeterminada
            jProgressBar1.setIndeterminate(false);
        }
    };

    // Inicia o processo de conversão
    conversaoTask.execute(); 
    }//GEN-LAST:event_bttconverterActionPerformed

    private void bttdiretorioselecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttdiretorioselecActionPerformed
        // TODO add your handling code here:
         JFileChooser directoryChooser = new JFileChooser();
         directoryChooser.setDialogTitle("Selecione o diretório de saída");
         directoryChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

    // Abrir o seletor de diretórios
         int returnValue = directoryChooser.showOpenDialog(this);
         if (returnValue == JFileChooser.APPROVE_OPTION) {
         File selectedDirectory = directoryChooser.getSelectedFile();
         // Exibir o diretório selecionado na interface
         txtdiretorio.setText("Diretório de saída: " + selectedDirectory.getAbsolutePath());
      }
    }//GEN-LAST:event_bttdiretorioselecActionPerformed

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
            java.util.logging.Logger.getLogger(conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new conversor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> audios;
    private javax.swing.JButton bttconverter;
    private javax.swing.JButton bttdiretorioselec;
    private javax.swing.JButton bttselecionar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel txtConverter;
    private javax.swing.JLabel txtdiretorio;
    private javax.swing.JLabel txtentrada;
    private javax.swing.JLabel txtformatsaida;
    private javax.swing.JLabel txttitulo;
    // End of variables declaration//GEN-END:variables
}
