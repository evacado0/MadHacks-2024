class Profile {
    // variables
    constructor(user, pw, n = "Default Name") {
        this.username = user;
        this.password = pw;
        this.name = n;
        this.coins = 0;
        this.friends = new Map();
        this.followers = new Map();
        this.tasks = [];
    }

    // get information
    getUsername() { return this.username; }
    getPassword() { return this.password; }
    getName() { return this.name; }
    getCoins() { return this.coins; }

    getFriends() { return this.friends; }
    getFollowers() { return this.followers; }
    getTasks() { return this.tasks; }

    // change profile
    addFollower(person) {
        this.followers.set(person.getUsername(), person);
        return person;
    }

    addFriend(person) {
        this.friends.set(person.getUsername(), person);
        return person;
    }

    addTask(task) {
        this.tasks.push(task);
        return task;
    }

    removeFollower(person) {
        this.followers.delete(person.getUsername());
        return person;
    }

    removeFriend(person) {
        this.friends.delete(person.getUsername());
        return person;
    }

    removeTask(task) {
        const index = this.tasks.indexOf(task);
        if (index > -1) {
            this.tasks.splice(index, 1);
        }
        return task;
    }

    addCoins(amount) {
        this.coins += amount;
        return this.coins;
    }

    removeCoins(amount) {
        this.coins -= amount;
        return this.coins;
    }

    // toString
    toString() {
        return this.name
    }
}

