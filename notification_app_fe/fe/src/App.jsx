import {useState,useEffect} from "react";
import NotificationsList from "./NotificationsList";

function App(){

  const [notifications, setNotifications] = useState([]);

    useEffect(() => {
    setNotifications([
      { id: 1, message: "message 1", type:"placement",read:false,timestamp: new Date() },
      { id: 2, message: "message 2", type: "result", read: false, timestamp: new Date() },
      { id: 3, message: "message 3", type: "event", read: false, timestamp: new Date() }
    ]);
  }, []);

  return(
    <div>
      <h1>Notification App</h1>
        {notifications.map((n)=>
            <NotificationsList key={n.id} notify={n} />
        )}
    </div>
  );
}
export default App;