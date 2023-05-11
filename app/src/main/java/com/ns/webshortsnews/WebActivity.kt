package com.ns.webshortsnews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebViewClient
import com.ns.webshortsnews.databinding.ActivityMainBinding
import com.ns.webshortsnews.databinding.ActivityWebBinding

class WebActivity : AppCompatActivity() {
    private lateinit var binding:ActivityWebBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWebBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val contentUrl =
            "https://rr2---sn-i5uif5t-cags.googlevideo.com/videoplayback?expire=1683733771&ei=q2hbZMS8M_SY3LUPpYOFiA0&ip=116.75.67.85&id=o-AH6E3XgAblrOvHCtc0YnAPuiWiWCcllgcMjfH586pKvs&itag=18&source=youtube&requiressl=yes&mh=45&mm=31%2C29&mn=sn-i5uif5t-cags%2Csn-gwpa-h55e7&ms=au%2Crdu&mv=m&mvi=2&pl=21&initcwndbps=1472500&vprv=1&svpuc=1&mime=video%2Fmp4&ns=8N9LH_G4oDnVXTJhI92EZIUN&gir=yes&clen=4430991&ratebypass=yes&dur=59.050&lmt=1681818681816243&mt=1683711911&fvip=5&fexp=24007246&c=WEB&txp=6310224&n=p61c3Sqozy6uRsa5M9r&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cvprv%2Csvpuc%2Cmime%2Cns%2Cgir%2Cclen%2Cratebypass%2Cdur%2Clmt&sig=AOq0QJ8wRAIgbKMdh2b0py5fAiWVUZBbjxK5B2RNNR883XIKDD-NK3UCIAk18QU_GO5nItQa1EFksKsTQRo3qZwOgw8p_wpW2SPu&lsparams=mh%2Cmm%2Cmn%2Cms%2Cmv%2Cmvi%2Cpl%2Cinitcwndbps&lsig=AG3C_xAwRgIhAJcy6qNGtPyb0FDMh_UfENbk4lrTSKvbrV5Cc_MeFq9KAiEAlClFRA6Pp4SmwsgOvbvLm5xiK7e64r3VrE8n8DAmGq4%3D"
        binding.webview.apply {
            val iFrame_4 = "<!DOCTYPE html> \n" +
                    "<html> \n" +
                    "<body margin=“0” padding=“0” > \n" +
                    "\n" +
                    "<video margin=“0” padding=“0” width=\"100%\" controls autoplay>\n" +
                    " <source src=\"${contentUrl}\" type=\"video/mp4\">\n" +
                    "</video>\n" +
                    "</body> \n" +
                    "</html>"
            binding.webview.requestFocus()
            settings.javaScriptEnabled = true
            settings.lightTouchEnabled = true
            settings.mixedContentMode = WebSettings.MIXED_CONTENT_COMPATIBILITY_MODE
            webViewClient = WebViewClient()
            settings.mediaPlaybackRequiresUserGesture = false
            loadData(iFrame_4, "text/html", "UTF-8")

        }
    }
}