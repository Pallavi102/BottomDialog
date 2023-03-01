package com.pallavi.bottomdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.pallavi.bottomdialog.databinding.ActivityMainBinding
import com.pallavi.bottomdialog.databinding.DialogbuttonBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnChange.setOnClickListener {
            var dialog=BottomSheetDialog(this)
           var dialogButtonBinding=DialogbuttonBinding.inflate(layoutInflater)
           dialog.setContentView(dialogButtonBinding.root)
            dialogButtonBinding.btnSubmit.setOnClickListener {

                if (dialogButtonBinding.etName.text.isEmpty())
                {
                    dialogButtonBinding.etName.error=resources.getString(R.string.app_name)
                }
                else
                {
                    binding.tv.text=dialogButtonBinding.etName.text.toString()

                }
            }

            dialog.show()




        }
    }

}