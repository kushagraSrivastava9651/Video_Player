package com.example.player

 import android.net.Uri
 import android.net.Uri.parse
 import android.os.Bundle
 import android.widget.MediaController
 import android.widget.VideoView
 import androidx.activity.ComponentActivity

 import com.example.player.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


                  val   videoView = findViewById<VideoView>(binding.videoView.id )
                    val mediaController = MediaController(this)
                    mediaController.setAnchorView(videoView)
                            val uri : Uri =parse("android.resource://"+packageName+"/raw/test")

                            videoView.setMediaController(mediaController)
                    videoView.setVideoURI(uri)
                    videoView.requestFocus()
                    videoView.start()
                }

    }

