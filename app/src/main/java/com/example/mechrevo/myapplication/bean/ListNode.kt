package com.example.mechrevo.myapplication.bean

data class ListNode(var value: Int, var next: ListNode?) {

    data class TreeNode(var value: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

}