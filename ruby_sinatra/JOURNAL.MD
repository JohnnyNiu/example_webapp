#### Running environment setup

Ruby need to be installed, I choose to use `rvm` as ruby version manager for my MBP.


##### Using RVM to manage ruby versions 
RVM is a ruby version manager. 
Installation can be found here: [website](https://rvm.io/)
Examples can be found here:[examples](https://rvm.io/workflow/examples)

To list all know ruby versions:
```
rvm list known
```

To install:
```
rvm install 2.4
```

To use a different version:
```
rvm use 2.3
```

Set ruby version for system:
```
rvm --default use 2.4
```
##### Using Bundler to manage dependencies

```bash
bundle update
```

```bash
bundle install
```