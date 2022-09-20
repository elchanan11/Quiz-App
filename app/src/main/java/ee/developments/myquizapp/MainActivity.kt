package ee.developments.myquizapp

import android.Manifest
import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.*
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.app.ActivityCompat

class MainActivity : AppCompatActivity() {

//    val openGalleryLauncher: ActivityResultLauncher<Intent> =
//        registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
//                reasult ->
//            if (reasult.resultCode == RESULT_OK && reasult.data!=null){
//                println("fffffffffffffffffffffffffffffffffffffffffffffffffffffffff")
//                val imageBackGround: ImageView = findViewById(R.id.ll_bg)
//                imageBackGround.setImageURI(reasult.data?.data)
//            }
//        }
//    private var permissions: ActivityResultLauncher<Array<String>> =
//        registerForActivityResult(
//            ActivityResultContracts.RequestMultiplePermissions()
//        ) { permissions ->
//            permissions.entries.forEach {
//                val permissionName = it.key
//                val isGranted = it.value
//                if (isGranted) {
//                    Toast.makeText(
//                        this,
//                        "permission granted now you can read thhe storage files. ",
//                        Toast.LENGTH_LONG
//                    ).show()
//
//                    val pickIntent = Intent(
//                        Intent.ACTION_PICK,
//                        MediaStore.Images.Media.EXTERNAL_CONTENT_URI
//                    )
//                    openGalleryLauncher.launch(pickIntent)
//
//                } else {
//                    if (permissionName == Manifest.permission.READ_EXTERNAL_STORAGE) {
//                        Toast.makeText(
//                            this,
//                            "Oops permission not granted. ",
//                            Toast.LENGTH_LONG
//                        ).show()
//                    }
//                }
//            }
//
//
//        }




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart: Button = findViewById(R.id.btn_start)
        val etName: EditText = findViewById(R.id.et_name)




        btnStart.setOnClickListener {

            if (etName.text.isEmpty()) {
                Toast.makeText(
                    this,
                    "please enter your name", Toast.LENGTH_LONG).show()
            }else{
                val intent = Intent(this,ChooseQuizActivity::class.java)
                intent.putExtra(Contacts.USER_NAME,etName.text.toString())

                startActivity(intent)
                finish()
            }

        }

    }


}