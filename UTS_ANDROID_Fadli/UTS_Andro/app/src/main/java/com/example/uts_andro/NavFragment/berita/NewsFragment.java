package com.example.uts_andro.NavFragment.berita;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.uts_andro.DetailBeritaActivity;
import com.example.uts_andro.R;
import com.example.uts_andro.adapter.AdapterNews;
import com.example.uts_andro.model.NewsModel;

public class NewsFragment extends Fragment {

    GridView gridView;
    AdapterNews adapterNews;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_news, container, false);
    }
    void loadDataList(){
        String[] foto = new String[]{
                //foto 1
                "https://akcdn.detik.net.id/visual/2019/01/16/b8b1c199-4900-439b-bb29-a84558035135_169.jpeg?w=715&q=90",
                //foto 2
                "https://statik.tempo.co/data/2022/05/22/id_1111559/1111559_720.jpg",
                //foto 3
                "https://statik.tempo.co/data/2022/05/22/id_1111554/1111554_720.jpg",
                //foto 4
                "https://statik.tempo.co/data/2022/05/21/id_1111388/1111388_720.jpg",
                //foto 5
                "https://statik.tempo.co/data/2022/05/19/id_1110888/1110888_720.jpg",
                //foto 6
                "https://static.republika.co.id/uploads/images/inpicture_slide/023671500-1649162572-830-556.jpg",
                //foto 7
                "https://static.republika.co.id/uploads/images/inpicture_slide/_210316224113-914.png",
                //foto 8
                "https://static.republika.co.id/uploads/images/inpicture_slide/penyakit-cacar-monyet-mengancam-_190515033420-224.jpg",
                //foto 9
                "https://cdn1-production-images-kly.akamaized.net/LQr2YBcSvvjuEDzq8BmECE-HhPA=/640x360/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/3618522/original/048715600_1635669108-000_9Q38M3.jpg",
                //foto 10
                "https://cdn1-production-images-kly.akamaized.net/tRP5pS9E8b_Um82cafV4ZAnIK84=/640x360/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/3468035/original/033832000_1622274035-WhatsApp_Image_2021-05-29_at_13.04.13.jpeg"
        };
        String[] title = new String[]{
                //judul 1
                "Berkat Minyak Goreng Rupiah Jadi Tak Malu-maluin",
                //judul 2
                "SEA Games: Hadapi Timnas U-23 Indonesia, Pelatih Malaysia Waspadai Tiga Hal Ini",
                //judul 3
                "Baliwood Land, Pengembangan Desa Jadi Tujuan Wisata Film Berbasis Budaya",
                //judul 4
                "Ubud Food Festival Juni 2022, Siapa Saja Ahli Kuliner yang Bakal Tampil",
                //judul 5
                "Indah dan Unik, Pantai Watu Bale Diyakini Syarief Hasan Bisa Mendunia",
                //judul 6
                "BMKG Perkirakan Jaksel dan Jaktim Hujan Disertai Petir",
                //judul 7
                "Bertemu Presiden Brasil di Resor Mewah, Elon Musk Berencana Investasi di Hutan Amazon",
                //judul 8
                "Ilmuwan Ungkap Wabah Cacar Monyet di Eropa dan AS tak Sama dengan Cacar Monyet di Afrika",
                //judul 9
                "Erik Ten Hag Tendang Aaron Wan-Bissaka, MU Siapkan Bek Barcelona",
                //judul 10
                "Atlet Indonesia Kembali Dominasi Podium Piala Dunia Panjat Tebing di Amerika Serikat"
        };
        String[] content = new String[]{
                "Jakarta, CNBC Indonesia - Nilai tukar rupiah menunjukkan kinerja yang buruk sepanjang Mei. Melawan dolar Amerika Serikat (AS) rupiah nyaris tak pernah menguat. Beruntung, pada perdagangan Jumat (20/5/2022) rupiah akhirnya mampu mencatat penguatan, bahkan cukup tajam.",
                "TEMPO.CO, Jakarta - Pertandingan Timnas U-23 Indonesia vs Malaysia akan terjadi dalam perebutan medali perunggu SEA Games 2021. Duel kedua tim dijadwalkan berlangsung di di Stadion My Dinh, Hanoi, Ahad, 22 Mei 2022, mulai 16.00 WIB.\n" + "Pelatih Malaysia, Brad Maloney, mengaku butuh banyak strategi untuk menghadapi kekuatan skuad Garuda Muda.\n\nJuru taktik asal Australia itu mengatakan bahwa tim asuhan Shin Tae-yong memiliki kekuatan yang tidak boleh diremehkan. Ia mengungkapkan ada beberapa hal yang diwaspadai menjelang pertandingan.\n\n\"Indonesia U-23 punya skuad yang dalam, banyak opsi serangan, termasuk pemain naturalisasi,\" kata Maloney, dalam sesi konferensi pers menjelang pertandingan.\n\n\"Mereka lawan yang tangguh. Kami butuh banyak solusi dan strategi untuk meraih hasil terbaik,\" kata dia menambahkan.\n\nIni akan menjadi pertemuan pertama Timnas U-23 Indonesia dan Malaysia di SEA Games 2021. Keduanya berada dalam dua tim berbeda di fase grup.\n\nTimnas Indonesia dikalahkan Thailand 0-1 di semifinal. Sedangkan, Malaysia takluk di tangan Vietnam 0-1.\n\nSaat menghadapi Malaysia, Timnas U-23 Indonesia dalam kondisi krisis pemain. Empat pemain inti tidak bisa dimainkan. Tiga di antaranya harus absen karena sanksi kartu merah yang diterima ketika melawan Thailand. Satu pemain lagi, Egy Maulana Vikri, mengalami cedera.\n\nFinal sepak bola putra SEA Games 2021 mempertemukan Timnas U-23 Vietnam vs Thailand. Laga ini juga akan digelar di Stadion My Dinh, Hanoi, pada hari yang sama, tetapi dimainkan pukul 19.00 WIB.",
                "TEMPO.CO, Jakarta - Pariwisata Bali akan semakin meriah dengan kehadiran Baliwood Land di Kabupaten Badung. Desa wisata itu akan dibangun sebagai pionir pengembangan desa wisata film bertaraf internasional berbasis budaya.\n\n\"Semoga pengembangan dua desa di Badung menjadi percontohan tempat produksi film dunia akan berkelanjutan dan berdampak pada pengembangan potensi budaya serta pemberdayaan masyarakat desa,\" kata Sekretaris Daerah Basung I Wayan Adi Arnawa saat menerima tim Baliwood Land dan tim Digital Kementerian Pariwisata dan Ekonomi Kreatif, Jumat, 20 Mei 2022.\n\nDesa yang akan dikembangkan itu adalah Desa Dauh Yeh Cani dan Desa Abiansemal di Kecamatan Abiansemal. Dua desa itu akan dikembangkan sebagai tempat pembangunan Baliwood Land dan pencanangan desa film internasional berbasis budaya lokal.\n\nBaliwood Land memiliki multi zona, yakni zona world tourism (wahana-wahana Film Adventures dikelola oleh warga desa filmmakers), global community scale production (digital media/filmmaking worldwide), world friendships (Baliwood TV prog) dan zona edukasi internasional  (cultural assets for film production assets).\n\nMenurut Wayan, pihaknya akan mendukung dan mendorong desa-desa yang lain untuk membangkitkan potensi yang dimiliki seperti yang dilakukan Baliwood Land. Terlebih, program tersebut juga sesuai dengan program Kemenparekraf tentang pembangunan desa kreatif yang membangun desa melalui inovasi dan kreatifitas berkelanjutan guna menciptakan lapangan kerja dan meningkatkan kesejahteraan masyarakat.\n\n\"Kami juga harapkan nantinya desa ini menjadi sebuah destinasi baru dan unggulan bagi badung. Untuk itu kami perintahkan Dinas Pariwisata Badung untuk segera membuat SK Desa Kreatif,\" kata Wayan.\n\nAnggota tim Baliwood Land Arvin I. Miracelova mengatakan kehadiran Baliwood Land ini untuk merespons pesatnya pertumbuhan digital media dunia tanpa batas dan perkembangan industri kontennya. Nantinya, bisa ditampilkan potensi keindahan alam yang masih sangat asri, berkelas dunia dan masih jarang dijamah oleh para wisatawan. \"Kami Baliwood Land hadir untuk mengembangkan Desa Wisata Film bertaraf Internasional, berbasis Budaya dan pemberdayaan masyarakat secara berkesinambungan,\" kata dia.",
                "TEMPO.CO, Jakarta - Ubud Food Festival bertema \"Heroes\" akan berlangsung pada 24-26 Juni 2022 di Taman Kuliner, Ubud, Gianyar, Bali. Pendiri dan Direktur Ubud Food Festival, Janet DeNeefe mengatakan, acara ini merupakan inisiatif memulihkan pariwisata Bali di masa pandemi.\n\n\"Selama tiga hari Ubud Food Festival, kami akan mengadakan perayaan kuliner, diskusi, lokakarya, musik, dan film yang menambah pengalaman kuliner dan budaya yang luar biasa,\" kata Janet DeNeefe dalam keterangan tertulis yang diterima Tempo, Sabtu, 21 Mei 2022. Panitia Ubud Food Festival telah memilih chef, ahli kuliner, perajin, food writers, dan petani untuk hadir dalam festival tersebut.\n\nUbud Food Festival akan memberikan penghormatan kepada William Wongso dengan Lifetime Achievement Award atas pengabdiannya terhadap kuliner Indonesia. Seorang social-eco entrepreneur terkemuka Indonesia, Helianti Hilman akan menyajikan hidangan unik yang terinspirasi dari relief Borobudur serta membicarakan penelitiannya mengenai proyek grastronomi heritage.\n\nAda pula Nyesha Arrington, seorang chef pemenang penghargaan berdarah Afrika, Amerika, dan Korea, yang tinggal di Los Angeles, Amerika Serikat. Dia akan menghadirkan plant-based di Fivelements. Andrew Walsh dari Cure, Michelin-starred di Singapura akan menghidangkan masakan Celticnya di Aperitif. Aga Alvian dari Meatsmith milik Dave Pynt membawa bara menjadi lebih panas di atas meja makan Api Jiwa.\n\nChef asal Meksiko, Diana Beltran akan bergabung bersama para chef dari Chili dan Peru untuk menyulap sebuah malam Latino dan rasa pedas yang tak terlupakan di Cantina, rooftop eatery baru di Ubud. Hadir kembali di Ubud Food Festival, Maurizio Bombini dari Mauri, Seminyak. Dia mengajak pengunjung untuk mencicipi keahliannya dalam menu 5-course Mediterranean di Mandapa.\n\nChef dari Young George, Melissa Palinkas menampilkan sajian Australia Barat dengan tiram mutiara Akoya bersama Amy Baard di Donna. Ayu Gayatri dan Gede Kresna dari Dapur Pengalaman Rasa meracik ritual Bali, keunikan rasa, resep luhur, dan dongeng ke meja makan Tall Trees di Westin. Kris Syamsudin membawa hidangan laut lobster, kepiting, dan ikan segar dari Kepulauan Sula di Halmahera Utara ke Casa Luna.\n\nDi panggung Teater Kuliner, Petty Elliott kembali pada akar Manado, tempat asalnya. Dia mengubah masakan tradisional Indonesia menjadi sebuah hidangan modern. Lisa Sibagariang, ahli fermentasi dari Locavore dan petualangan kuliner Bali-Bandung yang dipersembahkan oleh Parti Gastronomi.",
                "NASIONAL – Wakil Ketua MPR RI Prof. Dr. Sjarifuddin Hasan, MM, MBA (Syarief Hasan) mengunjungi pantai Watu Bale di Desa Jetak, Kecamatan Tulakan, Kabupaten Pacitan dalam rangkaian kunjungan kerjanya di Pacitan, Jawa Timur, baru-baru ini. Berkeliling area wisata, dia yakin pantai itu suatu saat akan mendunia.\n\n\"Objek wisata ini sangat bagus dan menarik. Akses masuk pun sudah tertata dengan rapi sehingga memudahkan pengunjung. Laut, batu karang, serta deburan ombak yang besar sangat memanjakan mata,” kata dia. “Saya rasa dengan keindahan dan keunikan yang dimiliki, pantai Watu Bale bisa mendunia dan banyak dikunjungi wisatawan,” tambahnya.\n\nPantai Watu Bale indah dan memiliki keunikan tersendiri. Antara lain, pantai ini tidak berpasir tetapi merupakan tebing cukup tinggi, yang berbatasan langsung dengan laut selatan, atau dikenal dengan istilah tanjung berbukit. Kemudian, terdapat keberadaan batu karang raksasa yang mirip 'bale'. Bale berasal dari bahasa Jawa yang artinya balai atau tempat untuk istirahat. Karena menjadi ikon dan ciri khas, destinasi wisata ini dinamakan pantai Watu Bale.\n\n\"Untuk menuju batu karang tersebut, pengunjung harus melewati jembatan gantung yang dibawahnya tak henti-hentinya datang deburan ombak besar seperti ingin memecah karang. Saya pikir, pasti penyuka adrenalin tinggi tentu sangat menikmati tantangan ini, \" ujar Syarief Hasan.\n\nSelama penelusurannya di area pantai, Syarief Hasan meninjau lapak-lapak dagangan UMKM masyarakat sekitar yang sangat beragam, mulai dari bermacam kuliner, kerajinan batik, dan bermacam suvenir. Melihat potensi besar yang dimiliki Pantai Watu Bale, Syarief Hasan pun meminta agar rakyat dan pemerintah daerah Pacitan menjaga serta mengelolanya dengan baik.\n\n\"Jika ini terjaga dan diurus dengan profesional maka dampaknya akan sangat baik yakni meningkatnya pendapatan daerah dan taraf hidup rakyat akan semakin naik,\" ujar dia.",
                "REPUBLIKA.CO.ID, JAKARTA -- Badan Meteorologi, Klimatologi dan Geofisika (BMKG) memperkirakan wilayah Jakarta Selatan dan Jakarta Timur diguyur hujan disertai petir dan angin kencang.\n\nBMKG melalui laman resmi di Jakarta, Ahad (22/5/2022), menjelaskan, hujan disertai petir dan angin kencang itu diperkirakan terjadi pada siang dan sore hari.\n\nPada Ahad pagi cuaca di Jakarta Barat, Jakarta Selatan dan Jakarta Timur diperkirakan cerah berawan. Kemudian Jakarta Utara, Jakarta Pusat dan Kepulauan Seribu diperkirakan berawan.\n\nNamun, memasuki siang hari cuaca mengalami perubahan. Jakarta Selatan dan Jakarta Timur diperkirakan hujan dengan intensitas sedang.\n\nSedangkan Jakarta Barat, Jakarta Pusat dan Jakarta Utara diperkirakan hujan ringan dan hanya Kepulauan Seribu diperkirakan berawan. Selanjutnya, pada malam hingga dini hari cuaca di seluruh wilayah DKI Jakarta diperkirakan berawan.\n\nSementara itu, suhu udara diperkirakan berada pada rentang minimum 24 hingga maksimum 33 derajat Celcius. Untuk tingkat kelembaban udara diperkirakan kisaran minimum 70 hingga maksimum 95 persen.",
                "REPUBLIKA.CO.ID, SAO PAULO -- Elon Musk bertemu dengan Presiden Brasil, Jair Bolsonaro, untuk membahas konektivitas internet dan proyek lain di hutan Amazon. Pertemuan tersebut diadakan di sebuah resor mewah di negara bagian Sao Paulo, Brasil.\n\nDilansir dari AP pada Sabtu (21/5/2022), hal ini diselenggarakan oleh Menteri Komunikasi Fabio Faria yang ingin  mencari kemitraan dengan orang terkaya di dunia untuk membawa atau meningkatkan internet di sekolah dan fasilitas kesehatan di daerah pedesaan menggunakan teknologi yang dikembangkan oleh SpaceX dan Starlink. Selain itu, dapat melestarikan hutan Amazon juga.\n\n\"Sangat senang berada di Brasil untuk peluncuran Starlink untuk 19.000 sekolah yang tidak terhubung di daerah pedesaan & pemantauan lingkungan Amazon,” kata Elon.\n\nSementara itu, Presiden Brasil Jair Bolsonaro mengatakan kawasan itu sangat penting bagi Brasil. Sehingga ia berharap dengan Elon untuk membantu hutan Amazon.\n\n\"Kami mengandalkan Elon Musk agar Amazon dikenal oleh semua orang di Brasil dan di dunia, untuk menunjukkan kegembiraan wilayah ini, bagaimana kami melestarikannya dan seberapa besar kerugian yang dilakukan oleh mereka yang menyebarkan kebohongan tentang wilayah ini terhadap kami,\" kata dia.\n\nDiketahui, kegiatan ilegal di hutan Amazon yang luas dipantau oleh beberapa lembaga, seperti badan antariksa nasional, polisi federal dan pengatur lingkungan. Tetapi deforestasi di Amazon Brasil telah melonjak di bawah Jair Bolsonaro, mencapai tingkat tahunan tertinggi dalam lebih dari satu dekade, menurut data resmi dari badan antariksa nasional.\n\nPara pengkritik Presiden Brasil Jair Bolsonaro mengatakan bahwa dialah yang paling bersalah, karena telah mendorong para penebang dan perampas tanah dengan dukungan kuatnya untuk pengembangan wilayah tersebut.",
                "REPUBLIKA.CO.ID, WASHINGTON -- Para ilmuwan yang telah memantau banyak wabah cacar monyet di Afrika mengatakan mereka bingung dengan penyebaran penyakit baru-baru ini di Eropa dan Amerika Utara. Sehingga mereka selidiki penyebab wabah tersebut.\n\nDilansir dari AP pada Sabtu (21/5/2022), kasus penyakit terkait cacar sebelumnya hanya terlihat di antara orang-orang yang memiliki hubungan dengan Afrika tengah dan Barat. Tetapi dalam seminggu terakhir, Inggris, Spanyol, Portugal, Italia, AS, Swedia dan Kanada semuanya melaporkan infeksi, sebagian besar pada pria muda yang sebelumnya tidak pernah bepergian ke Afrika.\n\nAda sekitar 80 kasus yang dikonfirmasi di seluruh dunia dan 50 lainnya yang dicurigai. Prancis, Jerman, Belgia dan Australia melaporkan kasus pertama mereka.\n\n\"Saya tercengang dengan ini. Setiap hari saya bangun dan ada lebih banyak negara yang terinfeksi,” kata Ahli Virologi sekaligus Akademi Sains Nigeria dan Dewan Penasihat WHO Oyewale Tomori.\n\nKemudian, ia melanjutkan ini bukan jenis penyebaran yang dilihat di Afrika Barat, jadi mungkin ada sesuatu yang baru terjadi di Barat. Hingga saat ini, tidak ada yang meninggal dalam wabah tersebut. \n\nCacar monyet biasanya menyebabkan demam, menggigil, ruam dan luka di wajah atau alat kelamin. Ia memperkirakan penyakit ini berakibat fatal hingga satu dari 10 orang tetapi vaksin cacar bersifat protektif dan beberapa obat antivirus sedang dikembangkan.\n\nSementara itu, seorang Profesor Penyakit Menular Rolf Gustafsonb mengatakan sangat sulit untuk membayangkan situasinya akan memburuk.\"Kami pasti akan menemukan beberapa kasus lebih lanjut di Swedia, tetapi saya tidak berpikir akan ada epidemi dengan cara apapun. Tidak ada yang menyarankan itu saat ini,\" kata dia.\n\nLalu, Seorang Profesor Vaksinologi di Universitas Witwatersrand di Johannesburg Shabir Mahdi mengatakan penyelidikan terperinci tentang wabah di Eropa termasuk menentukan siapa pasien pertama sekarang sangat penting.\n\n\"Kita harus benar-benar memahami bagaimana ini pertama kali dimulai dan mengapa virus sekarang mendapatkan daya tarik. Di Afrika, wabah cacar monyet sangat terkendali dan jarang terjadi.  Jika itu sekarang berubah, kita benar-benar perlu memahami alasannya,\" kata dia.\n\nDiketahui, Nigeria melaporkan sekitar 3.000 kasus cacar monyet per tahun. Wabah biasanya terjadi di daerah pedesaan, ketika orang memiliki kontak dekat dengan tikus dan tupai yang terinfeksi.\n\nPusat Pengendalian dan Pencegahan Penyakit Eropa merekomendasikan semua kasus yang dicurigai diisolasi dan bahwa kontak berisiko tinggi ditawarkan vaksin cacar.",
                "Liputan6.com, Jakarta - Erik ten Hag mulai bersih-bersih skuad Manchester United. Salah satu pemain yang kabarnya bakal dibuang manajer anyar asal Belanda itu adalah bek kanan Aaron Wan-Bissaka.\n\nPekan ini, Ten Hag dikabarkan telah memutuskan memasukkan Aaron Wan-Bissaka dalam daftar jual. Pemain asal Inggris ini tak dibutuhkan karena performa yang mengecewakan di musim 2021/2022.\n\nWan-Bissaka musim ini sudah mulai tergusur dari tim utama MU. Manajer interim Ralf Rangnick lebih sering memainkan Diogo Dalot pada paruh musim kedua.\n\nPemain 24 tahun itu menjadi sorotan karena tidak kunjung berkembang sejak dibeli Setan Merah dari Crystal Palace pada 2019 lalu dengan harga mahal 65 juta pounds. Wan-Bissaka hanya piawai saat bertahan, namun kedodoran saat membantu penyerangan.\n\nBakal didepaknya Wan-Bissaka menimbulkan rumor bila Manchester United bakal mendatangkan bek kanan baru. Media Spanyol Marca mengklaim MU tertarik merekrut pemain Barcelona asal Amerika Serikat Sergino Dest.\n\nBerita soal Erik ten Hag akan membuang Aaron Wan-Bissaka dan MU menyiapkan penggantinya dari Amerika Serikat menjadi yang terpopuler di kanal Bola Liputan6.com dalam 24 jam terakhir.",
                "Liputan6.com, Jakarta Atlet andalan panjat tebing Indonesia kategori Men's Speed, Kiromal Katibin dan Veddriq Leonardo kembali mendominasi podium International Federation of Sport Climbing World Cup (IFSC WC) 2022 kategori men's speed di Utah, Salt Lake City, Amerika Serikat, Jum'at malam (20/5/20222).Kedua atlet tersebut berhasil meraih medali emas dan perunggu setelah Kiromal Katibin dan Veddriq Leonardo berhasil finis di posisi pertama dan ketiga.\n\nKiromal Katibin berhasil meraih emas setelah mengalahkan Noah Bratschi, atlet asal Amerika Serikat yang mengalami false start di perebutan juara pertama. Katibin berhasil finis dengan catatan waktu 5,64 detik.\n\nSementara itu, Veddriq Leonardo berhasil meraih perunggu setelah mengalahkan Ludovico Fossali yang juga mengalami false start di perebutan juara ketiga. Veddriq berhasil finish dengan catatan waktu 5,49 detik.\n\nHal ini memperpanjang dominasi atlet Indonesia di kejuaraan panjat tebing dunia kategori speed dan juga menambah raihan positif bagi panjat tebing Indonesia di dunia.\n\nYenny Wahid, Ketua Umum Federasi Panjat Tebing Indonesia (FPTI) mengatakan, prestasi keduanya semakin mengukuhkan dominasi panjat tebing Indonesia di kancah dunia. Ia berharap raihan prestasi tersebut bisa memacu para atlet lainnya untuk meraih prestasi di Olimpiade Paris 2024 mendatang.\n\n\"Indonesia makin mengukuhkan dominasi kita dalam kejuaraan panjat tebing dunia. Ini tentunya menjadi pemacu semangat menuju puncak perolehan prestasi, yaitu di olympiade Paris tahun 2024 nanti,\" ujarnya seperti rilis yang diterima media."
        };

        for (int i = 0; i < foto.length; i++) {
            NewsModel model = new NewsModel();
            model.setImage(foto[i]);
            model.setTxtTitle(title[i]);
            model.setTxtContent(content[i]);
            adapterNews.add(model);
        }
        adapterNews.notifyDataSetChanged();
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        gridView = view.findViewById(R.id.gridView);
        adapterNews = new AdapterNews(getActivity(), R.layout.layout_card_berita);
        gridView.setAdapter(adapterNews);
        loadDataList();

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                NewsModel  model = (NewsModel) adapterView.getAdapter().getItem(i);

                Intent intent = new Intent(getActivity(), DetailBeritaActivity.class);
                intent.putExtra("foto", model.getImage());
                intent.putExtra("title", model.getTxtTitle());
                intent.putExtra("content", model.getTxtContent());
                startActivity(intent);
            }
        });
    }
}