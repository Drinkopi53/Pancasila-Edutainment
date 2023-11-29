package pancasila;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pancasila extends JFrame {

    private JPanel cardPanel;
    private CardLayout cardLayout;
    private JPanel startPanel, questionPanel, resultPanel;
    private JButton startButton, answerButton, showResultButton;
    private JLabel questionLabel, option1, option2, option3, option4, resultLabel;
    private int points = 0;

    public Pancasila() {
        setTitle("Quiz Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Panel utama untuk CardLayout
        cardPanel = new JPanel();
        cardLayout = new CardLayout();
        cardPanel.setLayout(cardLayout);

        // Panel untuk tampilan awal
        startPanel = new JPanel();
        startButton = new JButton("Start Game");
        startPanel.add(startButton);

        // Panel untuk pertanyaan kuis
        questionPanel = new JPanel();
        questionPanel.setLayout(new BoxLayout(questionPanel, BoxLayout.Y_AXIS));

        questionLabel = new JLabel("Pertanyaan 1: Apa warna langit?");
        option1 = new JLabel("Merah");
        option2 = new JLabel("Biru");
        option3 = new JLabel("Hijau");
        option4 = new JLabel("Kuning");

        answerButton = new JButton("Jawab");

        questionPanel.add(questionLabel);
        questionPanel.add(option1);
        questionPanel.add(option2);
        questionPanel.add(option3);
        questionPanel.add(option4);
        questionPanel.add(answerButton);

        // Panel untuk menampilkan hasil
        resultPanel = new JPanel();
        resultLabel = new JLabel("Total Points: 0");
        showResultButton = new JButton("Tampilkan Hasil");
        resultPanel.add(resultLabel);
        resultPanel.add(showResultButton);

        // Mengatur aksi untuk tombol "Start Game"
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.next(cardPanel); // Beralih ke panel berikutnya
            }
        });

        // Mengatur aksi untuk tombol "Jawab"
        answerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Cek jawaban yang benar (Anda dapat menyesuaikan jawaban sesuai kebutuhan)
                if (option2.getText().equals("Biru")) {
                    points += 50; // Tambahkan point jika jawaban benar
                }
                cardLayout.next(cardPanel); // Beralih ke panel berikutnya
                // Tambahkan logika untuk pertanyaan berikutnya di sini
            }
        });

        // Mengatur aksi untuk tombol "Tampilkan Hasil"
        showResultButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultLabel.setText("Total Points: " + points);
                cardLayout.next(cardPanel); // Beralih ke panel berikutnya
            }
        });

        // Menambahkan panel ke cardPanel dengan nama unik untuk masing-masing panel
        cardPanel.add(startPanel, "start");
        cardPanel.add(questionPanel, "question");
        cardPanel.add(resultPanel, "result");

        // Menampilkan cardPanel saat program dimulai
        add(cardPanel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Pancasila();
            }
        });
    }
}
