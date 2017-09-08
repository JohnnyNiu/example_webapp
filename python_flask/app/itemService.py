from app import db
from app.model.item import Item

def saveToDoItem(input):
    entry = Item(content=input.content)
    db.session.add(entry)
    db.session.commit()

def listItems():
    return db.session.query(Item).all();