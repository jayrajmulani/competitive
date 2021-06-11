class BST:
    def __init__(self, val=None):
        self.val = val
        self.left = None
        self.right = None

    def insert(self, val):
        if not self.val:
            self.val = val
            return
        if self.val == val:
            return
        if val < self.val:
            if self.left:
                self.left.insert(val)
                return
            self.left = BST(val)
            return
        if self.right:
            self.right.insert(val)
            return
        self.right = BST(val)
        return

    def printTree():
        pass

    def getMin():
        pass

    def getMax():
        pass
