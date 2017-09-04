class Item: 

    def __init__(self, content):
        self._content = content

    def getContent():
        return self._content

    def setContent(content):
        self._content = content

    def __str__(self):
        return "item: "+ self._content
