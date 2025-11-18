package pnzgu.rmp.fragmentslab.ui.newfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.findNavController
import pnzgu.rmp.fragmentslab.R

class NewFragment : Fragment() {

    private lateinit var fragmentLayout: View

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentLayout = inflater.inflate(R.layout.fragment_new, container, false)
        Toast.makeText(fragmentLayout.context, "Это новый фрагмент!", Toast.LENGTH_SHORT).show()
        val firstNameEditText: EditText = fragmentLayout.findViewById(R.id.FirstName)
        val secondNameEditText: EditText = fragmentLayout.findViewById(R.id.SecondName)
        val thirdNameEditText: EditText = fragmentLayout.findViewById(R.id.ThirdName)
        val groupNameEditText: EditText = fragmentLayout.findViewById(R.id.GroupName)
        val button: Button = fragmentLayout.findViewById(R.id.btnChangeColors)
        val editTexts =
            listOf(firstNameEditText, secondNameEditText, thirdNameEditText, groupNameEditText)
        var originalColor: Boolean = true
        button.setOnClickListener {
            originalColor = !originalColor
            val textColor =
                if (originalColor) {
                    ContextCompat.getColor(fragmentLayout.context, R.color.white)
                } else {
                    ContextCompat.getColor(fragmentLayout.context, R.color.yellow)
                }
            val backColor =
                if (originalColor) {
                    ContextCompat.getColor(fragmentLayout.context, R.color.yellow)
                } else {
                    ContextCompat.getColor(fragmentLayout.context, R.color.white)
                }
            editTexts.forEach {
                it.setBackgroundColor(backColor)
                it.setTextColor(textColor)
            }
        }
        val btnNext: Button = fragmentLayout.findViewById(R.id.btnNext)
        btnNext.setOnClickListener{
            val action = NewFragmentDirections.actionNewFragmentToSubFragment(
                firstName = firstNameEditText.text.toString(),
                secondName = secondNameEditText.text.toString(),
                thirdName = thirdNameEditText.text.toString(),
                groupName = groupNameEditText.text.toString()
            )
            findNavController().navigate(action)
        }
        return fragmentLayout
    }
}