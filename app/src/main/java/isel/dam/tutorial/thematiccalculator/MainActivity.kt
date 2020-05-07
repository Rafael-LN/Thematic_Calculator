package isel.dam.tutorial.thematiccalculator

import android.content.res.Configuration
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.exp
import kotlin.math.sqrt


class MainActivity : AppCompatActivity() {

    private var savedValue: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun changeElementsColor(color: Int) {
        appTitle.setTextColor(resources.getColor(color))

        buttonAdd.setTextColor(resources.getColor(color))
        buttonSub.setTextColor(resources.getColor(color))
        buttonMult.setTextColor(resources.getColor(color))
        buttonDiv.setTextColor(resources.getColor(color))
        buttonExp.setTextColor(resources.getColor(color))
        buttonSqrt.setTextColor(resources.getColor(color))

        operand1.setTextColor(resources.getColor(color))
        operand2.setTextColor(resources.getColor(color))

        edit_text1.setBackgroundColor(resources.getColor(color))
        edit_text2.setBackgroundColor(resources.getColor(color))
    }

    fun setMercedes(view: View) {

        container.setBackgroundResource(
            if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE){
                R.drawable.mercedes
            } else {
                R.drawable.mercedes_vertical
            }
        )

        changeElementsColor(R.color.ic_mercedes_background)
    }

    fun setFerrari(view: View) {

        container.setBackgroundResource(
            if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE){
                R.drawable.ferrari
            } else {
                R.drawable.ferrari_vertical
            }
        )

        changeElementsColor(R.color.ic_ferrari_background)
    }

    fun setRedBull(view: View) {

        container.setBackgroundResource(
            if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE){
                R.drawable.red_bull
            } else {
                R.drawable.redbull_vertical
            }
        )

        changeElementsColor(R.color.ic_redbull_background)
    }

    fun addition(view: View) =
        edit_text1.setText((
                edit_text1.text.toString().toDouble()
                        +
                        edit_text2.text.toString().toDouble()).toString())

    fun subtraction(view: View) =
        edit_text1.setText((
                edit_text1.text.toString().toDouble()
                        -
                        edit_text2.text.toString().toDouble()).toString())

    fun multiplication(view: View) =
        edit_text1.setText((
                edit_text1.text.toString().toDouble()
                        *
                        edit_text2.text.toString().toDouble()).toString())

    fun division(view: View) =
        edit_text1.setText((
                edit_text1.text.toString().toDouble()
                        /
                        edit_text2.text.toString().toDouble()).toString())

    fun exponential(view: View) = edit_text1.setText(exp(edit_text1.text.toString().toDouble()).toString())

    fun squareRoot(view: View) = edit_text1.setText(sqrt(edit_text1.text.toString().toDouble()).toString())

    fun setMem(view: View) {
        savedValue = edit_text1.text.toString().toDouble()
    }

    fun getMem(view: View) = edit_text1.setText(savedValue.toString())
}
