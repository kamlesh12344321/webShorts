package com.ns.webshortsnews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.viewpager2.widget.ViewPager2
import com.ns.webshortsnews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var pagerAdapter:WebPagerAdapter
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val bundle = intent.extras
        val data = bundle!!.getString("count")
        if (data == "All") {
            pagerAdapter = WebPagerAdapter(createContent())
        } else {
            pagerAdapter = WebPagerAdapter(createContentForOne())
        }
       val snapHelper = PagerSnapHelper()
        snapHelper.attachToRecyclerView(binding.viewPager)
        binding.viewPager.adapter = pagerAdapter
//        binding.viewPager.offscreenPageLimit = 1

    }

    private fun createContent() :List<WebData>{
        var webData = mutableListOf<WebData>()
        webData.add(WebData("",   "<video src=\"https://rr5---sn-h557snzr.googlevideo.com/videoplayback?expire=1683803552&ei=QHlcZPmRDr6A3LUP56aD8Ag&ip=2401%3A4900%3A630d%3Ab0d0%3A8420%3A931f%3A71d6%3Afc8d&id=o-ADaWsDqgOMinwZQvqlAuZLJXhwZ7mu_FjxeGA7rXzhmh&itag=18&source=youtube&requiressl=yes&vprv=1&svpuc=1&mime=video%2Fmp4&ns=EmyFlEWhmwXczOXhZHg4hi4N&gir=yes&clen=4446192&ratebypass=yes&dur=59.968&lmt=1683370830510648&fexp=24007246&c=WEB&txp=6310224&n=jCI1KUUT2S7xUqJik&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cvprv%2Csvpuc%2Cmime%2Cns%2Cgir%2Cclen%2Cratebypass%2Cdur%2Clmt&sig=AOq0QJ8wRQIhAKvYrs7dtZlqChmptrwyxgTfXMqA-p0R9yeS2Ozw7jPjAiBQSUe679AIxg3VNXWlNQHXjW0Ucp01K66DwfX1nhWzdg%3D%3D&rm=sn-ci5gup-cagr76&req_id=2dc916bce59a3ee&redirect_counter=2&cm2rm=sn-ci5gup-cvhr7e&cms_redirect=yes&cmsv=e&ipbypass=yes&mh=gm&mm=30&mn=sn-h557snzr&ms=nxu&mt=1683781729&mv=m&mvi=5&pl=44&lsparams=ipbypass,mh,mm,mn,ms,mv,mvi,pl&lsig=AG3C_xAwRQIgZCXo8eSyR82LI-BgFmeX1s_jIwN9pepsWVyQaIpQ0nwCIQDjR1sNHjxyi1tKcwP6F9io8Gjr82Qf95N_dA86vY6cQg%3D%3D\"\n" +
                "       poster=\"https://stat4.bollywoodhungama.in/wp-content/uploads/2022/10/Kantara-1-322x416.jpg\"     width=\"100%\"  muted autoplay\n" +
                "       style=\"border-radius: 0px; border: none !important; object-fit: fill; display: flex; align-self: center; justify-self: center; position: absolute; top: 0; left: 0; overflow: visible; \"\n" +
                "         onclick=\"this.paused?this.play():this.pause()\"></video>"))
        webData.add(WebData("",   "<video src=\"https://rr5---sn-h557snzr.googlevideo.com/videoplayback?expire=1683803552&ei=QHlcZPmRDr6A3LUP56aD8Ag&ip=2401%3A4900%3A630d%3Ab0d0%3A8420%3A931f%3A71d6%3Afc8d&id=o-ADaWsDqgOMinwZQvqlAuZLJXhwZ7mu_FjxeGA7rXzhmh&itag=18&source=youtube&requiressl=yes&vprv=1&svpuc=1&mime=video%2Fmp4&ns=EmyFlEWhmwXczOXhZHg4hi4N&gir=yes&clen=4446192&ratebypass=yes&dur=59.968&lmt=1683370830510648&fexp=24007246&c=WEB&txp=6310224&n=jCI1KUUT2S7xUqJik&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cvprv%2Csvpuc%2Cmime%2Cns%2Cgir%2Cclen%2Cratebypass%2Cdur%2Clmt&sig=AOq0QJ8wRQIhAKvYrs7dtZlqChmptrwyxgTfXMqA-p0R9yeS2Ozw7jPjAiBQSUe679AIxg3VNXWlNQHXjW0Ucp01K66DwfX1nhWzdg%3D%3D&rm=sn-ci5gup-cagr76&req_id=2dc916bce59a3ee&redirect_counter=2&cm2rm=sn-ci5gup-cvhr7e&cms_redirect=yes&cmsv=e&ipbypass=yes&mh=gm&mm=30&mn=sn-h557snzr&ms=nxu&mt=1683781729&mv=m&mvi=5&pl=44&lsparams=ipbypass,mh,mm,mn,ms,mv,mvi,pl&lsig=AG3C_xAwRQIgZCXo8eSyR82LI-BgFmeX1s_jIwN9pepsWVyQaIpQ0nwCIQDjR1sNHjxyi1tKcwP6F9io8Gjr82Qf95N_dA86vY6cQg%3D%3D\"\n" +
                "       poster=\"https://stat4.bollywoodhungama.in/wp-content/uploads/2022/10/Kantara-1-322x416.jpg\"     width=\"100%\"  muted autoplay\n" +
                "       style=\"border-radius: 0px; border: none !important; object-fit: fill; display: flex; align-self: center; justify-self: center; position: absolute; top: 0; left: 0; overflow: visible; \"\n" +
                "         onclick=\"this.paused?this.play():this.pause()\"></video>"))
        webData.add(WebData("",   "<video src=\"https://rr5---sn-h557snzr.googlevideo.com/videoplayback?expire=1683803552&ei=QHlcZPmRDr6A3LUP56aD8Ag&ip=2401%3A4900%3A630d%3Ab0d0%3A8420%3A931f%3A71d6%3Afc8d&id=o-ADaWsDqgOMinwZQvqlAuZLJXhwZ7mu_FjxeGA7rXzhmh&itag=18&source=youtube&requiressl=yes&vprv=1&svpuc=1&mime=video%2Fmp4&ns=EmyFlEWhmwXczOXhZHg4hi4N&gir=yes&clen=4446192&ratebypass=yes&dur=59.968&lmt=1683370830510648&fexp=24007246&c=WEB&txp=6310224&n=jCI1KUUT2S7xUqJik&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cvprv%2Csvpuc%2Cmime%2Cns%2Cgir%2Cclen%2Cratebypass%2Cdur%2Clmt&sig=AOq0QJ8wRQIhAKvYrs7dtZlqChmptrwyxgTfXMqA-p0R9yeS2Ozw7jPjAiBQSUe679AIxg3VNXWlNQHXjW0Ucp01K66DwfX1nhWzdg%3D%3D&rm=sn-ci5gup-cagr76&req_id=2dc916bce59a3ee&redirect_counter=2&cm2rm=sn-ci5gup-cvhr7e&cms_redirect=yes&cmsv=e&ipbypass=yes&mh=gm&mm=30&mn=sn-h557snzr&ms=nxu&mt=1683781729&mv=m&mvi=5&pl=44&lsparams=ipbypass,mh,mm,mn,ms,mv,mvi,pl&lsig=AG3C_xAwRQIgZCXo8eSyR82LI-BgFmeX1s_jIwN9pepsWVyQaIpQ0nwCIQDjR1sNHjxyi1tKcwP6F9io8Gjr82Qf95N_dA86vY6cQg%3D%3D\"\n" +
                "       poster=\"https://stat4.bollywoodhungama.in/wp-content/uploads/2022/10/Kantara-1-322x416.jpg\"     width=\"100%\"  muted autoplay\n" +
                "       style=\"border-radius: 0px; border: none !important; object-fit: fill; display: flex; align-self: center; justify-self: center; position: absolute; top: 0; left: 0; overflow: visible; \"\n" +
                "         onclick=\"this.paused?this.play():this.pause()\"></video>"))
        webData.add(WebData("",   "<video src=\"https://rr5---sn-h557snzr.googlevideo.com/videoplayback?expire=1683803552&ei=QHlcZPmRDr6A3LUP56aD8Ag&ip=2401%3A4900%3A630d%3Ab0d0%3A8420%3A931f%3A71d6%3Afc8d&id=o-ADaWsDqgOMinwZQvqlAuZLJXhwZ7mu_FjxeGA7rXzhmh&itag=18&source=youtube&requiressl=yes&vprv=1&svpuc=1&mime=video%2Fmp4&ns=EmyFlEWhmwXczOXhZHg4hi4N&gir=yes&clen=4446192&ratebypass=yes&dur=59.968&lmt=1683370830510648&fexp=24007246&c=WEB&txp=6310224&n=jCI1KUUT2S7xUqJik&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cvprv%2Csvpuc%2Cmime%2Cns%2Cgir%2Cclen%2Cratebypass%2Cdur%2Clmt&sig=AOq0QJ8wRQIhAKvYrs7dtZlqChmptrwyxgTfXMqA-p0R9yeS2Ozw7jPjAiBQSUe679AIxg3VNXWlNQHXjW0Ucp01K66DwfX1nhWzdg%3D%3D&rm=sn-ci5gup-cagr76&req_id=2dc916bce59a3ee&redirect_counter=2&cm2rm=sn-ci5gup-cvhr7e&cms_redirect=yes&cmsv=e&ipbypass=yes&mh=gm&mm=30&mn=sn-h557snzr&ms=nxu&mt=1683781729&mv=m&mvi=5&pl=44&lsparams=ipbypass,mh,mm,mn,ms,mv,mvi,pl&lsig=AG3C_xAwRQIgZCXo8eSyR82LI-BgFmeX1s_jIwN9pepsWVyQaIpQ0nwCIQDjR1sNHjxyi1tKcwP6F9io8Gjr82Qf95N_dA86vY6cQg%3D%3D\"\n" +
                "       poster=\"https://stat4.bollywoodhungama.in/wp-content/uploads/2022/10/Kantara-1-322x416.jpg\"     width=\"100%\"  muted autoplay\n" +
                "       style=\"border-radius: 0px; border: none !important; object-fit: fill; display: flex; align-self: center; justify-self: center; position: absolute; top: 0; left: 0; overflow: visible; \"\n" +
                "         onclick=\"this.paused?this.play():this.pause()\"></video>"))
        webData.add(WebData("",   "<video src=\"https://rr5---sn-h557snzr.googlevideo.com/videoplayback?expire=1683803552&ei=QHlcZPmRDr6A3LUP56aD8Ag&ip=2401%3A4900%3A630d%3Ab0d0%3A8420%3A931f%3A71d6%3Afc8d&id=o-ADaWsDqgOMinwZQvqlAuZLJXhwZ7mu_FjxeGA7rXzhmh&itag=18&source=youtube&requiressl=yes&vprv=1&svpuc=1&mime=video%2Fmp4&ns=EmyFlEWhmwXczOXhZHg4hi4N&gir=yes&clen=4446192&ratebypass=yes&dur=59.968&lmt=1683370830510648&fexp=24007246&c=WEB&txp=6310224&n=jCI1KUUT2S7xUqJik&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cvprv%2Csvpuc%2Cmime%2Cns%2Cgir%2Cclen%2Cratebypass%2Cdur%2Clmt&sig=AOq0QJ8wRQIhAKvYrs7dtZlqChmptrwyxgTfXMqA-p0R9yeS2Ozw7jPjAiBQSUe679AIxg3VNXWlNQHXjW0Ucp01K66DwfX1nhWzdg%3D%3D&rm=sn-ci5gup-cagr76&req_id=2dc916bce59a3ee&redirect_counter=2&cm2rm=sn-ci5gup-cvhr7e&cms_redirect=yes&cmsv=e&ipbypass=yes&mh=gm&mm=30&mn=sn-h557snzr&ms=nxu&mt=1683781729&mv=m&mvi=5&pl=44&lsparams=ipbypass,mh,mm,mn,ms,mv,mvi,pl&lsig=AG3C_xAwRQIgZCXo8eSyR82LI-BgFmeX1s_jIwN9pepsWVyQaIpQ0nwCIQDjR1sNHjxyi1tKcwP6F9io8Gjr82Qf95N_dA86vY6cQg%3D%3D\"\n" +
                "       poster=\"https://stat4.bollywoodhungama.in/wp-content/uploads/2022/10/Kantara-1-322x416.jpg\"     width=\"100%\"  muted autoplay\n" +
                "       style=\"border-radius: 0px; border: none !important; object-fit: fill; display: flex; align-self: center; justify-self: center; position: absolute; top: 0; left: 0; overflow: visible; \"\n" +
                "         onclick=\"this.paused?this.play():this.pause()\"></video>"))
        webData.add(WebData("",   "<video src=\"https://rr5---sn-h557snzr.googlevideo.com/videoplayback?expire=1683803552&ei=QHlcZPmRDr6A3LUP56aD8Ag&ip=2401%3A4900%3A630d%3Ab0d0%3A8420%3A931f%3A71d6%3Afc8d&id=o-ADaWsDqgOMinwZQvqlAuZLJXhwZ7mu_FjxeGA7rXzhmh&itag=18&source=youtube&requiressl=yes&vprv=1&svpuc=1&mime=video%2Fmp4&ns=EmyFlEWhmwXczOXhZHg4hi4N&gir=yes&clen=4446192&ratebypass=yes&dur=59.968&lmt=1683370830510648&fexp=24007246&c=WEB&txp=6310224&n=jCI1KUUT2S7xUqJik&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cvprv%2Csvpuc%2Cmime%2Cns%2Cgir%2Cclen%2Cratebypass%2Cdur%2Clmt&sig=AOq0QJ8wRQIhAKvYrs7dtZlqChmptrwyxgTfXMqA-p0R9yeS2Ozw7jPjAiBQSUe679AIxg3VNXWlNQHXjW0Ucp01K66DwfX1nhWzdg%3D%3D&rm=sn-ci5gup-cagr76&req_id=2dc916bce59a3ee&redirect_counter=2&cm2rm=sn-ci5gup-cvhr7e&cms_redirect=yes&cmsv=e&ipbypass=yes&mh=gm&mm=30&mn=sn-h557snzr&ms=nxu&mt=1683781729&mv=m&mvi=5&pl=44&lsparams=ipbypass,mh,mm,mn,ms,mv,mvi,pl&lsig=AG3C_xAwRQIgZCXo8eSyR82LI-BgFmeX1s_jIwN9pepsWVyQaIpQ0nwCIQDjR1sNHjxyi1tKcwP6F9io8Gjr82Qf95N_dA86vY6cQg%3D%3D\"\n" +
                "       poster=\"https://stat4.bollywoodhungama.in/wp-content/uploads/2022/10/Kantara-1-322x416.jpg\"     width=\"100%\"  muted autoplay\n" +
                "       style=\"border-radius: 0px; border: none !important; object-fit: fill; display: flex; align-self: center; justify-self: center; position: absolute; top: 0; left: 0; overflow: visible; \"\n" +
                "         onclick=\"this.paused?this.play():this.pause()\"></video>"))
        webData.add(WebData("",   "<video src=\"https://rr5---sn-h557snzr.googlevideo.com/videoplayback?expire=1683803552&ei=QHlcZPmRDr6A3LUP56aD8Ag&ip=2401%3A4900%3A630d%3Ab0d0%3A8420%3A931f%3A71d6%3Afc8d&id=o-ADaWsDqgOMinwZQvqlAuZLJXhwZ7mu_FjxeGA7rXzhmh&itag=18&source=youtube&requiressl=yes&vprv=1&svpuc=1&mime=video%2Fmp4&ns=EmyFlEWhmwXczOXhZHg4hi4N&gir=yes&clen=4446192&ratebypass=yes&dur=59.968&lmt=1683370830510648&fexp=24007246&c=WEB&txp=6310224&n=jCI1KUUT2S7xUqJik&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cvprv%2Csvpuc%2Cmime%2Cns%2Cgir%2Cclen%2Cratebypass%2Cdur%2Clmt&sig=AOq0QJ8wRQIhAKvYrs7dtZlqChmptrwyxgTfXMqA-p0R9yeS2Ozw7jPjAiBQSUe679AIxg3VNXWlNQHXjW0Ucp01K66DwfX1nhWzdg%3D%3D&rm=sn-ci5gup-cagr76&req_id=2dc916bce59a3ee&redirect_counter=2&cm2rm=sn-ci5gup-cvhr7e&cms_redirect=yes&cmsv=e&ipbypass=yes&mh=gm&mm=30&mn=sn-h557snzr&ms=nxu&mt=1683781729&mv=m&mvi=5&pl=44&lsparams=ipbypass,mh,mm,mn,ms,mv,mvi,pl&lsig=AG3C_xAwRQIgZCXo8eSyR82LI-BgFmeX1s_jIwN9pepsWVyQaIpQ0nwCIQDjR1sNHjxyi1tKcwP6F9io8Gjr82Qf95N_dA86vY6cQg%3D%3D\"\n" +
                "       poster=\"https://stat4.bollywoodhungama.in/wp-content/uploads/2022/10/Kantara-1-322x416.jpg\"     width=\"100%\"  muted autoplay\n" +
                "       style=\"border-radius: 0px; border: none !important; object-fit: fill; display: flex; align-self: center; justify-self: center; position: absolute; top: 0; left: 0; overflow: visible; \"\n" +
                "         onclick=\"this.paused?this.play():this.pause()\"></video>"))
        return webData
    }

    private fun createContentForOne() :List<WebData>{
        var webData = mutableListOf<WebData>()
        webData.add(WebData("",   "<video src=\"https://rr5---sn-h557snzr.googlevideo.com/videoplayback?expire=1683803552&ei=QHlcZPmRDr6A3LUP56aD8Ag&ip=2401%3A4900%3A630d%3Ab0d0%3A8420%3A931f%3A71d6%3Afc8d&id=o-ADaWsDqgOMinwZQvqlAuZLJXhwZ7mu_FjxeGA7rXzhmh&itag=18&source=youtube&requiressl=yes&vprv=1&svpuc=1&mime=video%2Fmp4&ns=EmyFlEWhmwXczOXhZHg4hi4N&gir=yes&clen=4446192&ratebypass=yes&dur=59.968&lmt=1683370830510648&fexp=24007246&c=WEB&txp=6310224&n=jCI1KUUT2S7xUqJik&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cvprv%2Csvpuc%2Cmime%2Cns%2Cgir%2Cclen%2Cratebypass%2Cdur%2Clmt&sig=AOq0QJ8wRQIhAKvYrs7dtZlqChmptrwyxgTfXMqA-p0R9yeS2Ozw7jPjAiBQSUe679AIxg3VNXWlNQHXjW0Ucp01K66DwfX1nhWzdg%3D%3D&rm=sn-ci5gup-cagr76&req_id=2dc916bce59a3ee&redirect_counter=2&cm2rm=sn-ci5gup-cvhr7e&cms_redirect=yes&cmsv=e&ipbypass=yes&mh=gm&mm=30&mn=sn-h557snzr&ms=nxu&mt=1683781729&mv=m&mvi=5&pl=44&lsparams=ipbypass,mh,mm,mn,ms,mv,mvi,pl&lsig=AG3C_xAwRQIgZCXo8eSyR82LI-BgFmeX1s_jIwN9pepsWVyQaIpQ0nwCIQDjR1sNHjxyi1tKcwP6F9io8Gjr82Qf95N_dA86vY6cQg%3D%3D\"   width=\"100%\"  muted autoplay style=\"border-radius: 0px; border: none !important; object-fit: fill; display: flex; align-self: center; justify-self: center; position: absolute; top: 0; left: 0; overflow: visible; \"   onclick=\"this.paused?this.play():this.pause()\"></video>"))
        return webData
    }
}