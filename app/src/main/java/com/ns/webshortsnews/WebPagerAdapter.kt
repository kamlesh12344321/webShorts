package com.ns.webshortsnews

import android.annotation.SuppressLint
import android.graphics.Bitmap
import android.os.SystemClock
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.recyclerview.widget.RecyclerView
import com.ns.webshortsnews.databinding.ItemPagerBinding

class WebPagerAdapter (private var itemList: List<WebData> = emptyList()): RecyclerView.Adapter<WebPagerAdapter.MyViewHolder>() {
    lateinit var binding: ItemPagerBinding
    var itemPosition = 0

    class MyViewHolder(val binding: ItemPagerBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyViewHolder {
        binding = ItemPagerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    @SuppressLint("SetJavaScriptEnabled")
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        itemPosition = position
        with(holder) {
            if (itemPosition == 0) {
                binding.webview.apply {
                    binding.webview.requestFocus()
                    webChromeClient = object :WebChromeClient(){
                        override fun getDefaultVideoPoster(): Bitmap? {
                            val result = super.getDefaultVideoPoster()
                            return result ?: Bitmap.createBitmap(1, 1, Bitmap.Config.RGB_565)
                        }
                    }
                    settings.javaScriptEnabled = true
                    settings.mixedContentMode = WebSettings.MIXED_CONTENT_COMPATIBILITY_MODE
                    webViewClient = WebViewClient()
                    settings.mediaPlaybackRequiresUserGesture = false
                    loadData(itemList[holder.adapterPosition].contentUrl, "text/html", "UTF-8")
                }
            }
        }
    }

    override fun getItemCount(): Int = itemList.size

    @SuppressLint("SetJavaScriptEnabled")
    override fun onViewAttachedToWindow(holder: MyViewHolder) {
        super.onViewAttachedToWindow(holder)
        if (itemPosition != 0) {
            binding.webview.reload()
            binding.webview.apply {
                binding.webview.requestFocus()
                clearCache(true)
                clearHistory()
                webChromeClient = object : WebChromeClient() {
                    override fun getDefaultVideoPoster(): Bitmap? {
                        val result = super.getDefaultVideoPoster()
                        return result ?: Bitmap.createBitmap(1, 1, Bitmap.Config.RGB_565)
                    }
                }

                settings.javaScriptEnabled = true
                settings.mixedContentMode = WebSettings.MIXED_CONTENT_COMPATIBILITY_MODE
                webViewClient = WebViewClient()
                settings.mediaPlaybackRequiresUserGesture = false
                loadData(itemList[holder.adapterPosition].contentUrl, "text/html", "UTF-8")
            }
        }
    }

    @SuppressLint("SetJavaScriptEnabled")
    override fun onViewDetachedFromWindow(holder: MyViewHolder) {
        super.onViewDetachedFromWindow(holder)
        binding.webview.onPause()
//        binding.webview.apply {
//            clearCache(true)
//            clearHistory()
//            stopLoading()
//            binding.webview.requestFocus()
//            settings.javaScriptEnabled = true
//            webChromeClient = object :WebChromeClient(){
//            override fun getDefaultVideoPoster(): Bitmap? {
//                val result = super.getDefaultVideoPoster()
//                return result ?: Bitmap.createBitmap(1, 1, Bitmap.Config.RGB_565)
//            }
//        }
//            settings.mixedContentMode = WebSettings.MIXED_CONTENT_COMPATIBILITY_MODE
//            webViewClient = WebViewClient()
//            settings.mediaPlaybackRequiresUserGesture = false
//            if (itemPosition == 0) {
//                loadData("", "text/html", "UTF-8")
//            }
//        }
    }

}


