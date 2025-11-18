package pnzgu.rmp.fragmentslab.ui.subfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import pnzgu.rmp.fragmentslab.R

class SubFragment : Fragment(){

    private lateinit var fragmentLayout : View

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentLayout = inflater.inflate(R.layout.fragment_sub, container, false)
        val args = SubFragmentArgs.fromBundle(requireArguments())
        val fnTextView : TextView = fragmentLayout.findViewById(R.id.tvFirstName)
        val snTextView : TextView = fragmentLayout.findViewById(R.id.tvSecondName)
        val tnTextView : TextView = fragmentLayout.findViewById(R.id.tvThirdName)
        val gnTextView : TextView = fragmentLayout.findViewById(R.id.tvGroupName)
        fnTextView.text = args.firstName
        snTextView.text = args.secondName
        tnTextView.text = args.thirdName
        gnTextView.text = args.groupName
        return fragmentLayout
    }
}
