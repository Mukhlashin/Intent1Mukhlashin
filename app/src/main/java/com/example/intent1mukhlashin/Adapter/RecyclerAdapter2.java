package com.example.intent1mukhlashin.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.example.intent1mukhlashin.FragContainer.ContainerFragment2;
import com.example.intent1mukhlashin.R;

public class RecyclerAdapter2 extends RecyclerView.Adapter<ContainerFragment2> {

    String[] namaBuah = {"Alpukat","Apel","Ceri","Durian","Jambu Air","Manggis","Strawberry",};
    String[] deskripsiBuah = {"Avokad (Persea americana) ialah tumbuhan penghasil buah meja dengan nama sama. Tumbuhan ini berasal dari Meksiko dan Amerika Tengah dan kini banyak dibudidayakan di Amerika Selatan dan Amerika Tengah sebagai tanaman perkebunan monokultur dan sebagai tanaman pekarangan di daerah-daerah tropika lainnya di dunia.\n" +
            "\n" +
            "Pohon, dengan batang mencapai tinggi 20 m dengan daun sepanjang 12 hingga 25 cm. Bunganya tersembunyi dengan warna hijau kekuningan dan ukuran 5 hingga 10 milimeter. Ukurannya bervariasi dari 7 hingga 20 sentimeter, dengan massa 100 hingga 1000 gram; biji yang besar, 5 hingga 6,4 sentimeter.\n" +
            "\n" +
            "Buahnya bertipe buni, memiliki kulit lembut tak rata berwarna hijau tua hingga ungu kecoklatan, tergantung pada varietasnya. Daging buah apokat berwarna hijau muda dekat kulit dan kuning muda dekat biji, dengan tekstur lembut.","Apel adalah jenis buah-buahan, atau buah yang dihasilkan dari pohon buah apel. Buah apel biasanya berwarna merah kulitnya jika masak dan (siap dimakan), namun bisa juga kulitnya berwarna hijau atau kuning. Kulit buahnya agak lembek, daging buahnya keras. Buah ini memiliki beberapa biji di dalamnya.\n" +
            "\n" +
            "Orang mulai pertama kali menanam apel di Asia Tengah. Kini apel berkembang di banyak daerah di dunia yang suhu udaranya lebih dingin. Nama ilmiah pohon apel dalam bahasa Latin ialah Malus domestica. Apel budidaya adalah keturunan dari Malus sieversii asal Asia Tengah, dengan sebagian genom dari Malus sylvestris (apel hutan/apel liar).\n" +
            "\n" +
            "Kebanyakan apel bagus dimakan mentah-mentah (tak dimasak), dan juga digunakan banyak jenis makanan pesta. Apel dimasak sampai lembek untuk dibuat saus apel. Apel juga dibuat untuk menjadi minuman sari buah apel.","Ceri adalah kelompok tumbuhan maupun buahnya anggota marga Prunus. Ceri tidak mencakup satu jenis saja, tetapi ada beberapa, seperti P. cerasus, P. avium, dan P. emarginata.\n" +
            "\n" +
            "Ceri adalah pohon yang sangat disukai di Jepang dan bunganya disebut sakura. Pada awal musim semi, di saat bunga ceri bermekaran, orang-orang berpiknik di taman-taman yang ditumbuhi pohon ini. Di Australia ceri biasanya matang sekitar waktu Natal, sedangkan di Amerika dan Eropa selatan pada bulan Juni. Produksi di seluruh dunia saat ini tiga juta ton per tahun. Selain itu bunga dan buah ceri juga dijadikan hiasan hidangan makanan atau minuman. Buah ceri mengandung antosianin, yaitu pigmen warna merah yang baik untuk kesehatan karena merupakan antioksidan. Selain itu, rutin mengkonsumsi buah ceri setiap hari dapat menurunkan jumlah kadar asam urat dalam tubuh, bahkan dapat menyembuhkan pirai.","Durian adalah nama tumbuhan tropis yang berasal dari wilayah Asia Tenggara, sekaligus nama buahnya yang bisa dimakan. Nama ini diambil dari ciri khas kulit buahnya yang keras dan berlekuk-lekuk tajam sehingga menyerupai duri. Sebutan populernya adalah \"raja dari segala buah\" (King of Fruit). Durian adalah buah yang kontroversial, meskipun banyak orang yang menyukainya, namun sebagian yang lain malah muak dengan aromanya.\n" +
            "\n" +
            "Sesungguhnya, tumbuhan dengan nama durian bukanlah spesies tunggal tetapi sekelompok tumbuhan dari marga Durio.[1] Namun, yang dimaksud dengan durian (tanpa imbuhan apa-apa) biasanya adalah Durio zibethinus. Jenis-jenis durian lain yang dapat dimakan dan kadangkala ditemukan di pasar tempatan di Asia Tenggara di antaranya adalah lai (D. kutejensis), kerantungan (D. oxleyanus), durian kura-kura atau kekura (D. graveolens), serta lahung (D. dulcis). Untuk selanjutnya, uraian di bawah ini mengacu kepada D. zibethinus.","Jambu air adalah tumbuhan dalam suku jambu-jambuan atau Myrtaceae yang berasal dari Asia Tenggara. Jambu air sebetulnya berbeda dengan jambu semarang (Syzygium samarangense), kerabat dekatnya yang memiliki pohon dan buah hampir serupa. Beberapa kultivarnya bahkan sukar dibedakan, sehingga kedua-duanya kerap dinamai dengan nama umum jambu air atau jambu saja. Jambu air mudah ditanam dan di budidaya.\n" +
            "\n" +
            "Nama-nama lainnya adalah jambu ayer mawar (Malaysia), jambu aie (Min.), jambu cai (Sd.), jambu wer (Jw.), jhambhu wir (Md.), nyambu er (Bl.), kumpas, kumpasa, kombas, kembes (bahasa-bahasa di Sulut), jambu jene, jambu salo (Sulsel), jambu waelo, kuputol waelo, lutune waele, kopo olo (aneka bahasa di Seram dan sekitarnya), dan lain-lain.[1] Juga jambu kancing (Ind.), untuk kultivar yang buahnya kecil-kecil.","Manggis (Garcinia mangostana L.) adalah sejenis pohon hijau abadi dari daerah tropika yang diyakini berasal dari Semenanjung Malaya dan menyebar ke Kepulauan Nusantara. Tumbuh hingga mencapai 7 sampai 25 meter. Buahnya juga disebut manggis, berwarna merah keunguan ketika matang, meskipun ada pula varian yang kulitnya berwarna merah. Buah manggis dalam perdagangan dikenal sebagai \"ratu buah\", sebagai pasangan durian, si \"raja buah\". Buah ini mengandung mempunyai aktivitas antiinflamasi dan antioksidan. Sehingga di luar negeri buah manggis dikenal sebagai buah yang memiliki kadar antioksidan tertinggi di dunia.\n" +
            "\n" +
            "Manggis berkerabat dengan kokam, asam kandis dan asam gelugur, rempah bumbu dapur dari tradisi boga India dan Sumatera.","Stroberi atau tepatnya stroberi kebun (juga dikenal dengan nama arbei, dari bahasa Belanda aardbei) adalah sebuah varietas stroberi yang paling banyak dikenal di dunia. Seperti spesies lain dalam genus Fragaria (stroberi), buah ini berada dalam keluarga Rosaceae. Secara umum buah ini bukanlah buah, melainkan buah palsu,[1] artinya daging buahnya tidak berasal dari ovari tanaman (achenium) tetapi dari bagian bawah hypanthium yang berbentuk mangkok[2] tempat ovari tanaman itu berada.[3][4]\n" +
            "\n" +
            "\n" +
            "Buah stroberi yang sudah masak\n" +
            "Buah stroberi berwarna hijau keputihan ketika sedang berkembang, dan pada kebanyakan spesies berubah menjadi merah ketika masak. Namanya berasal dari bahasa Inggris kuno streawberige yang merupakan gabungan dari streaw atau \"straw\" dan berige atau \"berry\". Alasan pemberian nama ini masih tidak jelas. Beberapa spesies Lepidoptera mengambil sumber makanannya dari tumbuhan stroberi, menjadikan spesies ini hama utama tanaman stroberi."};
    int[] gambarBuah = {R.drawable.alpukat, R.drawable.apel, R.drawable.ceri, R.drawable.durian, R.drawable.jambuair, R.drawable.manggis, R.drawable.strawberry};

    @NonNull
    @Override
    public ContainerFragment2 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ContainerFragment2 containerFragment2, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
