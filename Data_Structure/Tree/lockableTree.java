package Tree;

import java.util.*;

class TreeNode {
    String val;
    Integer lockedBy = null;
    TreeNode parent;
    int lockedDescendent = 0;
    Vector<TreeNode> child;
    TreeNode(){}
    TreeNode(String key) {
        this.val = key;
        this.child = new Vector<TreeNode>();
    }
}

public class lockableTree {
    public static boolean isLocked(TreeNode node){
        return node.lockedBy!=null ? true : false;
    }

    public static boolean lock(TreeNode node , int uid) {
        if (isLocked(node)) {
            return false;
        }
        if (!canLockOrUnlock(node)) {
            return false;
        }
        node.lockedBy = uid;
        TreeNode parentNode = node.parent;
        while (parentNode != null) {
            parentNode.lockedDescendent += 1;
            parentNode = parentNode.parent;
        }

        return true;
    }

    public static boolean unLock(TreeNode node , int uuid) {
        Integer user = node.lockedBy;
        if (user==null || user != uuid) {
            return false;
        }
        node.lockedBy = null;
        TreeNode parentNode = node.parent;

        while (parentNode != null) {
            parentNode.lockedDescendent -= 1;
            parentNode = parentNode.parent;
        }
        return true;
    }
    public static boolean upgradeUtilSafe(TreeNode parent , int uuid){
        Vector <TreeNode> children = parent.child;
        boolean isSafe = true;
        for(TreeNode child : children){
            if(child.lockedBy != null && child.lockedBy != uuid) return false;
            if(!upgradeUtilSafe(child , uuid)) {
                isSafe =  false;
                return isSafe;
            }
        }
        return isSafe;
    }
    public static void unLockChildren(TreeNode node){
        Vector <TreeNode> children = node.child;
        for(TreeNode child : children){
            child.lockedBy = null;
            child.lockedDescendent = 0;
            unLockChildren(child);
        }
    }
    public static boolean upgradeLock(TreeNode node , int uuid){
        if (!canLockOrUnlock(node.parent)) {
            return false;
        }
        if(upgradeUtilSafe(node , uuid)){
            unLockChildren(node);
            node.lockedDescendent = 0;
            return lock(node, uuid);
        }
        return false;

    }

    public static boolean canLockOrUnlock(TreeNode node) {
        if(node == null) return true;
        if (node.lockedDescendent > 0) {
            return false;
        }
        TreeNode parentNode = node.parent;
        while (parentNode != null) {
            if (isLocked(parentNode)) {
                return false;
            }
            parentNode = parentNode.parent;
        }
        return true;
    }

    public static void main(String[] args) {
          int n = 7;
          int c = 2;
          TreeNode world = new TreeNode("world");
          TreeNode asia = new TreeNode("asia");
          TreeNode africa = new TreeNode("africa");
          TreeNode china = new TreeNode("china");
          TreeNode india = new TreeNode("india");
          TreeNode southAfrica = new TreeNode("southAfrica");
          TreeNode egypt = new TreeNode("egypt");

          asia.parent = world;
          africa.parent = world;
          world.child.add(asia);
          world.child.add(africa);

          china.parent = asia;
          india.parent = asia;
          asia.child.add(china);
          asia.child.add(india);

          southAfrica.parent = africa;
          egypt.parent = africa;
          africa.child.add(southAfrica);
          africa.child.add(egypt);

          System.out.println(lockableTree.lock(india , 1));
          System.out.println(lockableTree.lock(china , 2));
          System.out.println(lockableTree.upgradeLock(world , 1));
          System.out.println(lockableTree.unLock(india , 1));


    }
}
