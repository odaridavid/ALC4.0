package com.lca.odari.alc40.ui


import android.net.http.SslError
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.SslErrorHandler
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.lca.odari.alc40.R
import kotlinx.android.synthetic.main.fragment_alc_view.view.*


class AlcViewFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_alc_view, container, false)
        view.webview.webViewClient = object : WebViewClient() {
            override fun onReceivedSslError(view: WebView?, handler: SslErrorHandler?, error: SslError?) {
                val message = when (error?.primaryError) {
                    SslError.SSL_DATE_INVALID -> "Date Invalid"
                    SslError.SSL_EXPIRED -> "Expired"
                    SslError.SSL_IDMISMATCH -> "ID Mismatch"
                    SslError.SSL_INVALID -> "Invalid"
                    SslError.SSL_NOTYETVALID -> "Not Yet Valid"
                    SslError.SSL_UNTRUSTED -> "Untrusted"
                    else -> "Unknown"
                }
                Toast.makeText(context, "SSL Certificates : $message", Toast.LENGTH_LONG).show()
                handler?.proceed()
            }
        }
        view.webview.loadUrl("https://andela.com/alc/")
        return view
    }


}
