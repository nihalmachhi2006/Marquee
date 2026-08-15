// // debugger;

// greet("Nihal")


// function greet(name){
//     console.log(`Hello ${name}`);   
// }


// const sayhello = "hello Nihal";

// sayhello.indexOf(0);


async function fetchGitHubUser(username) {
  try {
    const response = await fetch(`https://api.github.com/users/${username}`, {
      headers: {
        'Accept': 'application/vnd.github+json'
      }
    });

    if (!response.ok) {
      throw new Error(`User not found (Status: ${response.status})`);
    }

    const data = await response.json();
    console.log(data);
    return data;
  } catch (error) {
    console.error('Error:', error.message);
  }
}

// Usage:
fetchGitHubUser('deven-deshmukh');
