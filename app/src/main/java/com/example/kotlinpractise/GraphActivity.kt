package com.example.kotlinpractise

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import de.blox.graphview.*

abstract class GraphActivity : AppCompatActivity() {
    protected val nodeText: String
        get() = "Node " + nodeCount++
    private var nodeCount = 1
    private var currentNode: Node? = null
   protected lateinit var adapter:BaseGraphAdapter<ViewHolder>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val graph = createGraph()

        setupAdapter(graph)
        val newNode = Node(nodeText)
    }

    private fun setupAdapter(graph: Graph) {
        val graphView = findViewById<GraphView>(R.id.graph)
        adapter = object :BaseGraphAdapter<ViewHolder>(graph){
            override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
                val view = LayoutInflater.from(parent?.context).inflate(R.layout.node, parent, false)
                return SimpleViewHolder(view)
            }

            override fun onBindViewHolder(viewHolder: ViewHolder?, data: Any?, position: Int) {
                (viewHolder as SimpleViewHolder).textView.text = data.toString()
            }
            inner class SimpleViewHolder(itemView: View) : ViewHolder(itemView) {
                var textView: TextView = itemView.findViewById(R.id.textView)

            }
        }

            setAlgorithm(adapter)
        graphView.adapter=adapter
        graphView.setOnItemClickListener { parent, view, position, id ->
            currentNode = adapter.getNode(position)
            Toast.makeText( this,"Clicked on " + currentNode!!.data.toString(), Toast.LENGTH_SHORT).show()
        }
    }

     abstract fun setAlgorithm(adapter: BaseGraphAdapter<ViewHolder>)

    abstract fun createGraph(): Graph
}
