async function upvoteClickHandler(event) {
  event.preventDefault();
  //Parse out id with window.location method
  const id = window.location.toString().split('/')[
    window.location.toString().split('/').length - 1
  ];

  //Save the id from method above to property postId for fetch/PUT request
  const response = await fetch('/posts/upvote', {
    method: 'PUT',
    body: JSON.stringify({
        postId: id
    }),
    headers: {
      'Content-Type': 'application/json'
    }
  });

  if (response.ok) {
    document.location.reload();
  } else {
    alert(response.statusText);
  }
}

document.querySelector('.upvote-btn').addEventListener('click', upvoteClickHandler);