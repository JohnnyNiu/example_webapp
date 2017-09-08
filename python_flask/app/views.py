from flask import request, render_template, redirect
from app import app
from app import itemService
from app.model.item import Item 

@app.route('/todo/create', methods=['GET'])
def createTodoItemForm():
    return render_template('createItem.html', name="niu")

@app.route('/todo/create', methods=['POST'])
def createTodoItem():
    itemContent = request.form['content']
    toSave = Item(content=itemContent)
    itemService.saveToDoItem(toSave)
    return redirect('/todo/list')

@app.route('/todo/list', methods=['GET'])
def listTodoItems():
    items = itemService.listItems()
    print(items)
    return render_template('listItems.html', items = items)