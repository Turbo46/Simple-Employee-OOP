import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SimpleEmployeeDatabase extends JFrame implements ActionListener {

    private Container c;
    private JLabel title;
    private JLabel nama;
    private JTextField tnama;
    private JLabel jamMasuk;
    private JTextField tjamMasuk;
    private JLabel shift;
    private JRadioButton pagi;
    private JRadioButton malam;
    private ButtonGroup gengp;
    private JLabel tanggalMasuk;
    private JComboBox date;
    private JComboBox month;
    private JComboBox year;
    private JLabel jamPulang;
    private JTextField tjamPulang;
    private JCheckBox jujur;
    private JButton sub;
    private JButton reset;
    private JTextArea tout;
    private JLabel res;
    private JTextArea resadd;

    private String dates[]
            = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
    private String months[]
            = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sept", "Oct", "Nov", "Dec" };
    private String years[]
            = { "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021" };

    public SimpleEmployeeDatabase()
    {
        setTitle("Employee Management System");
        setBounds(300, 90, 1000, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Absensi Karyawan");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        c.add(title);

        nama = new JLabel("Nama");
        nama.setFont(new Font("Arial", Font.PLAIN, 20));
        nama.setSize(100, 20);
        nama.setLocation(100, 100);
        c.add(nama);

        tnama = new JTextField();
        tnama.setFont(new Font("Arial", Font.PLAIN, 15));
        tnama.setSize(190, 20);
        tnama.setLocation(200, 100);
        c.add(tnama);

        jamMasuk = new JLabel("Masuk");
        jamMasuk.setFont(new Font("Arial", Font.PLAIN, 20));
        jamMasuk.setSize(100, 20);
        jamMasuk.setLocation(100, 150);
        c.add(jamMasuk);

        tjamMasuk = new JTextField();
        tjamMasuk.setFont(new Font("Arial", Font.PLAIN, 15));
        tjamMasuk.setSize(150, 20);
        tjamMasuk.setLocation(200, 150);
        c.add(tjamMasuk);

        shift = new JLabel("Shift");
        shift.setFont(new Font("Arial", Font.PLAIN, 20));
        shift.setSize(100, 20);
        shift.setLocation(100, 200);
        c.add(shift);

        pagi = new JRadioButton("Pagi");
        pagi.setFont(new Font("Arial", Font.PLAIN, 15));
        pagi.setSelected(true);
        pagi.setSize(75, 20);
        pagi.setLocation(200, 200);
        c.add(pagi);

        malam = new JRadioButton("Malam");
        malam.setFont(new Font("Arial", Font.PLAIN, 15));
        malam.setSelected(false);
        malam.setSize(80, 20);
        malam.setLocation(275, 200);
        c.add(malam);

        gengp = new ButtonGroup();
        gengp.add(pagi);
        gengp.add(malam);

        tanggalMasuk = new JLabel("Tanggal");
        tanggalMasuk.setFont(new Font("Arial", Font.PLAIN, 20));
        tanggalMasuk.setSize(100, 20);
        tanggalMasuk.setLocation(100, 250);
        c.add(tanggalMasuk);

        date = new JComboBox(dates);
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setSize(50, 20);
        date.setLocation(200, 250);
        c.add(date);

        month = new JComboBox(months);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setSize(60, 20);
        month.setLocation(250, 250);
        c.add(month);

        year = new JComboBox(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(100, 20);
        year.setLocation(320, 250);
        c.add(year);

        jamPulang = new JLabel("Pulang");
        jamPulang.setFont(new Font("Arial", Font.PLAIN, 20));
        jamPulang.setSize(100, 20);
        jamPulang.setLocation(100, 300);
        c.add(jamPulang);

        tjamPulang = new JTextField();
        tjamPulang.setFont(new Font("Arial", Font.PLAIN, 15));
        tjamPulang.setSize(150, 20);
        tjamPulang.setLocation(200, 300);
        c.add(tjamPulang);

        jujur = new JCheckBox("Saya mengisinya dengan jujur");
        jujur.setFont(new Font("Arial", Font.PLAIN, 15));
        jujur.setSize(250, 20);
        jujur.setLocation(150, 400);
        c.add(jujur);

        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 450);
        sub.addActionListener(this);
        c.add(sub);

        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(270, 450);
        reset.addActionListener(this);
        c.add(reset);

        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(300, 400);
        tout.setLocation(500, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        c.add(tout);

        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(100, 500);
        c.add(res);

        resadd = new JTextArea();
        resadd.setFont(new Font("Arial", Font.PLAIN, 15));
        resadd.setSize(200, 75);
        resadd.setLocation(580, 175);
        resadd.setLineWrap(true);
        c.add(resadd);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == sub) {
            if (jujur.isSelected()) {
                String data1;
                String data
                        = "Nama : "
                        + tnama.getText() + "\n"
                        + "Jam Masuk : "
                        + tjamMasuk.getText() + "\n";
                if (pagi.isSelected())
                    data1 = "Shift : Pagi"
                            + "\n";
                else
                    data1 = "Shift : Malam"
                            + "\n";
                String data2
                        = "Tanggal Masuk : "
                        + (String)date.getSelectedItem()
                        + "/" + (String)month.getSelectedItem()
                        + "/" + (String)year.getSelectedItem()
                        + "\n";

                String data3 = "Jam Pulang : " + tjamPulang.getText();
                tout.setText(data + data1 + data2 + data3);
                tout.setEditable(false);
                res.setText("Absen Telah berhasil.....Selamat Datang");
            }
            else {
                tout.setText("");
                resadd.setText("");
                res.setText("Verifikasi Absensi" + "centang pernyataan jujur...");
            }
        }

        else if (e.getSource() == reset) {
            String def = "";
            tnama.setText(def);
            tjamPulang.setText(def);
            tjamMasuk.setText(def);
            res.setText(def);
            tout.setText(def);
            jujur.setSelected(false);
            date.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);
            resadd.setText(def);
        }
    }
}
class Database {

    public static void main(String[] args) throws Exception
    {
        SimpleEmployeeDatabase f = new SimpleEmployeeDatabase();
    }
}