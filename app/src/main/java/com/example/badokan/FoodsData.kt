import com.example.badokan.Food
import com.example.badokan.R

object FoodsData {
    private val foodNames = arrayOf(
        "Ayam Lodho",
        "Bakso Malang",
        "Lontong Balap",
        "Nasi Krawu",
        "Lontong Kupang",
        "Pecel Madiun",
        "Rawon",
        "Rujak Cingur",
        "Rujak Soto",
        "Soto Lamongan"
    )
    private val foodLocation = arrayOf(
        "Tulungagung",
        "Malang",
        "Surabaya",
        "Gresik",
        "Sidoarjo",
        "Madiun",
        "Surabaya",
        "Surabaya",
        "Banyuwangi",
        "Lamongan"
    )
    private val foodRating = arrayOf(
        9.6,
        9.1,
        9.7,
        9.9,
        8.9,
        9.3,
        9.8,
        9.1,
        8.7,
        9.4
    )
    private val foodImages = intArrayOf(
        R.drawable.ayam_lodho,
        R.drawable.bakso_malang,
        R.drawable.lontong_balap,
        R.drawable.nasi_krawu,
        R.drawable.lontong_kupang,
        R.drawable.pecel_madiun,
        R.drawable.rawon,
        R.drawable.rujak_cingur,
        R.drawable.rujak_soto,
        R.drawable.soto_lamongan
    )

    private val foodDescription = arrayOf(
        "Ayam Lodho adalah masakan khas daerah Tulungagung dan Trenggalek yang berupa ayam bakar atau goreng yang disajikan dengan kuah santan berempah yang khas. Ayam Lodho memiliki dua ciri khas, yakni jenis ayam yang digunakan dan cara memasak. Ayam Lodho memiliki dua ciri khas, yakni jenis ayam yang digunakan dan cara memasak.\nAyam yang digunakan untuk memasak Ayam Lodho hanyalah ayam kampung saja, tidak bisa menggunakan ayam petelur. Lalu cara memasaknya menggunakan dua tahap yakni pembakaran dan penumisan. Ayam kampung yang telah disiapkan kemudian dibelah dua lalu dibuka lebar dan dilumuri garam. Ayam dipanggang di atas bara api sampai setengah matang.",
        "Bakso khas Malang memeliki bervariasi menu, seperti siomay, tahu, aneka macama goreng, bakso goreng, mie bihun, tahu putih, lontong, tahu isi dan masih banyak lagi. Berbedea dengan bakso yang ada di kota lain, yang hanya menyajikan bakso bulat saja. Menurut sejarah, bakso Malang berasal dari makanan khas warga Tionghoa.\nNama bakso berasal dari Bak-So yang artinya daging giling. Namun dulu warga Tionghoa menggunakan daging babi sebagai bahan pokok bakso. Dikarenakan Indonesia banak warga Muslim, bahan pokok diganti dengan daging sehingga bisa dinikmati semua kalangan.",
        "Lontong Balap adalah makanan tradisional yang dalamnya terdapat aneka bahan seperti lontong, taoge, tahu goreng, lentho dan lain – lain yang kemudian dicampur menjadi satu dan disiram dengan kuah khusus. Makanan ini merupakan makanan tradisional yang sangat terkenal di Jawa Timur. Salah satunya di Surabaya yang menjadikan makanan ini sebagai salah satu makanan khas di sana. Selain memiliki nama yang unik, Lontong Balap ini juga memiliki cita rasa yang khas sehingga sangat disukai baik masyarakat ataupun para wisatawan yang berkunjung ke sana.",
        "Nasi Krawu adalah makanan tradisional yang terdiri dari nasi dan aneka menu pelengkap seperti daging suwir, sambal serta poyah atau serundeng yang terbuat dari parutan kelapa. Makanan ini biasanya disajikan di atas daun pisang atau sering di sebut dengan pincok. Nasi Krawu merupakan salah satu makanan khas yang terkenal di Gresik, Jawa Timur. Nama Nasi Krawu sendiri berasal dari istilah krawuk, yang dalam istilah masyarakat Gresik berarti \"mengambil sembarang dengan menggunakan tangan\". Karena kebanyakan penjual menyajikan dan menyiapkan menunya hanya menggunakan tangan, sehingga banyak yang menyebutnya Nasi Krawu/Sego Krawu.",
        "Lontong Kupang adalah makanan tradisional terbuat dari bahan dasar kupang yang dimasak dengan cara khusus dan disajikan bersama dengan lontong. Kupang sendiri merupakan hewan laut sejenis kerang yang memiliki bentuk sangat kecil dan memiliki warna tubuh berwarna coklat pucat. Kupang ini biasanya dapat ditemukan di pinggir pantai atau lumpur air asin. Lontong Kupang ini merupakan salah satu makanan tradisional yang sangat terkenal di Jawa Timur, terutama di Sidoarjo yang menjadikan Lontong Kupang ini sebagai makanan khas di sana. Selain Sidoarjo, Lontong Kupang ini juga terdapat di daerah lain seperti surabaya dan pasuruan.",
        "Pecel Madiun menjadi salah satu pecel paling legendaris di Jawa Timur. Pecel ini terkenal karena sambalnya yang relatif lebih pedas dan gurih. Selain itu, Pecel Madiun juga memiliki banyak komponen tambahan seperti beragam sayuran rebus, kemangi, serundeng, oseng-oseng tempe, mi kuning, dan rempeyek. Penjual Pecel Madiun biasanya juga menyediakan berbagai macam gorengan dan berbagai jenis tusukan seperti usus, telur puyuh, ati-rempela, dan lain sebagainya.",
        "Rawon merupakan kuliner khas Jawa Timur, berupa sup daging dengan kuah berwarna hitam. Warna hitam dari kuah Rawon berasal dari buah kepayang atau sering disebut dengan kluwak. Meskipun dikenal sebagai masakan khas Jawa Timur,  Rawon juga dikenal luas oleh oleh masyarakat Jawa Tengah sebelah timur terutama daerah Surakarta. Selain itu yang menjadi keistimewaan dari Rawon adalah rasa yang dihasilkan dari kluwak sehingga aroma hidangan menjadi kuat dan berempah . Rawon biasanya disajikan bersama nasi hangat dan dilengkapi dengan tauge rebus. Untuk menambahkan rasa penikmat rawon dapat menambahkan daun bawang, sambal, dan jeruk nipis sesuai selera. Rawon juga cocok dikonsumsi bersama kerupuk udang, telur asin, dan daging sapi goreng atau empal.",
        "Rujak Cingur merupakan kuliner khas Jawa Timur yang banyak ditemui di jalan-jalan Kota Surabaya. Kuliner ini bahkan bisa juga ditemui di kota lainnya, mengingat kudapan yang satu ini banyak digemari oleh masyarakat. Cingur yang dalam bahasa Jawa Timur berarti congor atau mulut sapi merupakan bahan utama dalam pembuatan rujak unik ini. Sementara bumbu rujak cingur sendiri terbuat dari bahan-bahan berupa gula merah, kacang tanah yang sudah digoreng, garam dan cabai yang banyaknya sesuai selera. Untuk melengkapi cita rasa khas Jawa Timur, bumbu rujak cingur ditambah dengan petis dan asam jawa. Bumbu tersebut disatukan dan diulek pada cobek besar yang sesekali ditambah air agar tidak terlalu kental. Setelah bumbu rujak selesai di buat, satukan berbagai bahan yang sudah dipersiapkan sebelumnya, lalu aduk hingga bumbu merata.",
        "Rujak Soto adalah makanan tradisional yang merupakan perpaduan antara makanan rujak khas Jawa Timur dan soto. Perpaduan makanan tradisional satu ini memang sangat unik, sehingga menghasilkan cita rasa yang sangat khas. Rujak Soto ini merupakan salah satu makanan tradisional dari Banyuwangi, Jawa Timur. Di Banyuwangi makanan satu ini cukup terkenal dan menjadi salah satu icon kuliner disana. Rujak Soto ini merupakan makanan tradisional yang sangat unik, karena merupakan perpaduan antara makanan rujak dan soto. Soto yang kita kenal merupakan makanan yang berkuah dan menyegarkan, dicampur dengan rujak yang dikenal merupakan makanan tradisional tanpa kuah tentu menghasilkan rasa yang sangat khas.",
        "Soto Lamongan adalah sajian makanan soto ayam yang khas dari Lamongan, Jawa Timur. Soto yang satu ini sangat khas dan berbeda dengan soto lainnya, baik dari segi penyajian maupun rasanya. Soto Lamongan ini sedikit berbeda dengan soto lainnya. Salah satu ciri khas dari Soto Lamongan ini terletak pada serbuk krupuk udangnya yang sering disebut Koya. Apabila serbuk Koya tersebut di campurkan dengan kuahnya maka akan menghasilkan rasa gurih yang khas pada Soto Lamongan ini. selain rasanya nikmat, aroma Soto Lamongan ini juga sangat menggugah selera. Dalam penyajiannya, Soto Lamongan ini disajikan dengan nasi dan bahan tambahan lainnya seperti suwiran daging ayam, irisan kol, tomat, daun bawang, mie bihun dan irisan telur ayam dalam satu mangkuk. Kemudian di siram dengan kuah soto dan ditamburkan Koya dan bawang goreng."
    )

    private val descptionSourcee = arrayOf(
        "https://www.genpi.co/travel/24905/ayam-lodho-cita-rasa-bumbu-khas-santan-rempah-dari-jawa-timur",
        "https://kumparan.com/kabarpaspasuruan/ini-dia-fakta-unik-tentang-bakso-malang/full",
        "http://www.negerikuindonesia.com/2015/08/lontong-balap-makanan-tradisional-dari.html",
        "http://www.negerikuindonesia.com/2015/09/nasi-krawu-makanan-tradisional-dari.html",
        "http://www.negerikuindonesia.com/2015/08/lontong-kupang-makanan-tradisional-dari.html",
        "https://www.merdeka.com/jatim/pecel-madiun-pecel-paling-legendaris-seantero-negeri.html",
        "https://bangka.sonora.id/read/502205480/rawon-makanan-khas-jawa-timur-yang-bercita-rasa-khas-dan-berempah",
        "https://indonesiakaya.com/pustaka-indonesia/rujak-cingur-rujak-dengan-citarasa-yang-lengkap/",
        "http://www.negerikuindonesia.com/2015/08/rujak-soto-makanan-tradisional-dari.html",
        "http://www.negerikuindonesia.com/2015/08/soto-lamongan-makanan-tradisional-dari.html"
    )

    val listData: ArrayList<Food>
        get() {
            val list = arrayListOf<Food>()
            for (position in foodNames.indices) {
                val food = Food()
                food.name = foodNames[position]
                food.location = foodLocation[position]
                food.rating = foodRating[position]
                food.image = foodImages[position]
                food.description = foodDescription[position]
                food.source = descptionSourcee[position]
                list.add(food)
            }
            return list
        }
}