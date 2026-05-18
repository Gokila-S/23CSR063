function NotificationsList(props) {
    return (
        <div>
            <h2>Notification {props.id} </h2>
            <ul>
                <li>{props.message}</li>
                <li>{props.type}</li>
                <li>{props.read ? "Read" : "Unread"}</li>
                <li>{props.timestamp}</li>
            </ul>
        </div>
    );
}
export default NotificationsList;