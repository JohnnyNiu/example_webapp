from app import db

class Item(db.Model): 

    id = db.Column(db.Integer, primary_key=True)
    content = db.Column(db.String(200))

    def __str__(self):
        return "<item> "+ self.content
