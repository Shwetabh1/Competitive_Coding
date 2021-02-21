''' Given a sorted array of unique integers,
    create a Binary search tree from it.'''
    
class Node:
    def __init__(val):
        self.value = val
        self.right = None
        self.left = None
             
def create_bst(arr):
    # base condition
    if arr is None:
        return None
    
    middle = len(arr) / 2
    root = Node(arr[middle])
    root.left = create_bst(arr[:middle])
    root.right = create_bst(arr[middle:])
    
    return root
    