from flask import request, render_template
from app import app
from app import toDoItemService
from app.model.item import Item 

@app.route('/todo/create', methods=['GET'])
def createTodoItemForm():
    return render_template('createItem.html', name="niu")

@app.route('/todo/create', methods=['POST'])
def createTodoItem():
    content = request.form['content']
    toSave = Item(content)
    toDoItemService.saveToDoItem(toSave)
    return request.form['content']
